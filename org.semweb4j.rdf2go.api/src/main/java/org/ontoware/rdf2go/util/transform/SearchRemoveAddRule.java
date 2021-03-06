/**
 * LICENSE INFORMATION
 *
 * Copyright 2005-2008 by FZI (http://www.fzi.de).
 * Licensed under a BSD license (http://www.opensource.org/licenses/bsd-license.php)
 * <OWNER> = Max Völkel
 * <ORGANIZATION> = FZI Forschungszentrum Informatik Karlsruhe, Karlsruhe, Germany
 * <YEAR> = 2010
 *
 * Further project information at http://semanticweb.org/wiki/RDF2Go
 */

package org.ontoware.rdf2go.util.transform;

import java.util.Map;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.RDF2Go;
import org.ontoware.rdf2go.model.DiffReader;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.Statement;
import org.ontoware.rdf2go.model.impl.DiffImpl;
import org.ontoware.rdf2go.model.node.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SearchRemoveAddRule implements TransformerRule {

	private static Logger log = LoggerFactory
			.getLogger(SearchRemoveAddRule.class);
	
	private String search, remove, add;
	
	public SearchRemoveAddRule(String search, String remove, String add) {
		super();
		this.search = search;
		this.remove = remove;
		this.add=add;
	}

	public SearchRemoveAddRule(String search, String replace) {
		super();
		this.search = search;
		this.remove = search;
		this.add=replace;
	}

	@Override
    public void applyRule(Model model, Map<String, URI> namespaceMap) {
		searchAndReplace(model, namespaceMap, this.search, this.remove,this.add);
	}	
	
	public static void searchAndReplace( Model model, Map<String, URI> namespaceMap, String search, String remove, String add ) {
		log.trace("rule remove... ");
		Model removeModel = RDF2Go.getModelFactory().createModel();
		removeModel.open();
		ClosableIterator<Statement> it = model.sparqlConstruct(
				Transformer.toSparqlConstruct(namespaceMap, remove, search))
				.iterator();
		while (it.hasNext()) {
			Statement stmt = it.next();
			log.trace("rule removes "+stmt);
			removeModel.addStatement(stmt);
		}
		it.close();

		log.trace("rule remove... ");
		Model addModel = RDF2Go.getModelFactory().createModel();
		addModel.open();
		it = model.sparqlConstruct(
				Transformer.toSparqlConstruct(namespaceMap, add, search))
				.iterator();
		while (it.hasNext()) {
			Statement stmt = it.next();
			log.trace("rule adds    "+stmt);
			addModel.addStatement(stmt);
		}
		it.close();

		DiffReader diff = new DiffImpl(addModel.iterator(), removeModel.iterator());
		addModel.close();
		removeModel.close();
		model.update(diff);
	}
}
