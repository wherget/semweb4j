package org.ontoware.rdfreactor.generator;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ontoware.rdf2go.Reasoning;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdfreactor.generator.java.JModel;

/**
 * <b>CodeGenerator</b> is more of a 'model generator'
 * 
 * The main() and generate() methods should be used from external users to start
 * the generation of a Java class model representing a given RDFS/OWL schema
 * file.
 * 
 * @author voelkel
 * 
 */
public class CodeGenerator {

	public static final String GENERATOR_VERSION = "$Id: CodeGenerator.java 785 2007-05-31 15:47:01Z voelkel $";

	private static Log log = LogFactory.getLog(CodeGenerator.class);

	public static final String SEMANTICS_RDFS = "rdfs";

	public static final String SEMANTICS_OWL = "owl";

	public static final String SEMANTICS_RDFS_AND_OWL = "rdfs+owl";

	/**
	 * Generate a Java class model from the given RDFS/OWL schema file
	 * 
	 * @param args
	 *            schemafilename, outdir, packagename, (RDFS|OWL)
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		generate(args[0], args[1], args[2], args[3], true, true, "");
	}

	/**
	 * TODO read from config file and respect in template This is already used
	 * in the veloctiy template
	 */
	@SuppressWarnings("unused")
	private static boolean readOnly = false;

	public static void generate(String schemafilename, String outdir,
			String packagename, Reasoning semantics, boolean skipbuiltins,
			boolean alwaysWriteToModel) throws Exception {
		generate(schemafilename, outdir, packagename, semantics, skipbuiltins,
				alwaysWriteToModel, "");
	}

	/**
	 * Generate a Java class model from the given RDFS/OWL schema file
	 * 
	 * @param schemafilename
	 *            a path to an rdf or owl file in N3, NT or XML syntax. File
	 *            extension determines parsing.
	 * @param outdir-
	 *            e.g './src' or './gen-src'
	 * @param packagename -
	 *            e.g. 'org.ontoware.myname.reactor'
	 * @param semantics -
	 *            'rdfs', 'owl' or 'rdfs+owl' (experimental)
	 * @param skipbuiltins
	 *            if false, internal helper classes are re-generated. This is
	 *            usually not needed.
	 * @param alwaysWriteToModel
	 *            if false, public contructors allow for the choice
	 * @throws Exception
	 */
	public static void generate(String schemafilename, String outdir,
			String packagename, Reasoning semantics, boolean skipbuiltins,
			boolean alwaysWriteToModel, String methodnamePrefix)
			throws Exception {

		// first step
		Model schemaDataModel = loadSchemaDataModel(schemafilename);
		File outDir = new File(outdir);

		generate(schemaDataModel, outDir, packagename, semantics, skipbuiltins,
				alwaysWriteToModel, methodnamePrefix);
	}

	public static void generate(String schemafilename, String outdir,
			String packagename, String semantics, boolean skipbuiltins,
			boolean alwaysWriteToModel, String methodnamePrefix)
			throws Exception {

		Reasoning reasoning;

		if (semantics.equalsIgnoreCase(SEMANTICS_RDFS))
			reasoning = Reasoning.rdfs;
		else if (semantics.equalsIgnoreCase(SEMANTICS_OWL))
			reasoning = Reasoning.owl;
		else if (semantics.equalsIgnoreCase(SEMANTICS_RDFS_AND_OWL))
			reasoning = Reasoning.rdfsAndOwl;
		else
			throw new RuntimeException("Unknown semantics: '" + semantics + "'");

		generate(schemafilename, outdir, packagename, reasoning, skipbuiltins,
				alwaysWriteToModel, methodnamePrefix);
	}

	/**
	 * 
	 * @param jenaSchemaDataModel -
	 *            a Model from hp.jena
	 * @param outDir
	 * @param packagename
	 * @param semantics
	 * @param skipbuiltins
	 * @param alwaysWriteToModel
	 * @param methodnamePrefix
	 * @throws Exception
	 */
	public static void generate(
			Model jenaSchemaDataModel, File outDir,
			String packagename, Reasoning semantics, boolean skipbuiltins,
			boolean alwaysWriteToModel, String methodnamePrefix)
			throws Exception {

		log.info("using semantics: " + semantics);
		// different semantics mean different ways to create the internal model
		JModel jm;

		// second step
		if (semantics == Reasoning.rdfs) {
			log.info("MODEL generating RDFS into " + outDir.getAbsolutePath()
					+ " ...");
			jm = ModelGenerator.createFromRDFS_Schema(jenaSchemaDataModel,
					packagename, skipbuiltins);
		} else if (semantics == Reasoning.owl) {
			log
					.info("generating OWL into " + outDir.getAbsolutePath()
							+ " ...");
			jm = ModelGenerator.createFromOWL(jenaSchemaDataModel, packagename,
					skipbuiltins);
		} else if (semantics == Reasoning.rdfsAndOwl) {
			log.info("MODEL generating RDFS+OWL mix semantics into "
					+ outDir.getAbsolutePath() + " ...");
			jm = ModelGenerator.createFromRDFS_AND_OWL(jenaSchemaDataModel,
					packagename, skipbuiltins);
		} else
			throw new RuntimeException("Can't handle the semantics of '"
					+ semantics + "'");

		log.info("set alwaysWriteToModel to "+alwaysWriteToModel);
		jm.setAlwaysWriteToModel(alwaysWriteToModel);

		// third and final step
		log.info("write using sourceCodeWriter");
		SourceCodeWriter.write(jm, outDir, SourceCodeWriter.TEMPLATE_CLASS,
				methodnamePrefix);
	}

	/**
	 * load & deanonymize a schema file into a Jena RDF model
	 * 
	 * @param schemafilename
	 * @return Jena RDF Model loaded from given filename
	 * @throws Exception
	 */
	public static Model loadSchemaDataModel(String schemafilename)
			throws Exception {
		File schemaFile = new File(schemafilename);
		log.info("loading from " + schemaFile.getCanonicalPath());
		Model schemaDataModel =	ModelReaderUtils.read(schemafilename);
		return schemaDataModel;

	}

}
