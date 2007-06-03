
/**
 * generated by http://RDFReactor.ontoware.org on 19.12.06 14:46
 */
package org.ontoware.rdfreactor.test.tag;

import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;



/**
 * This class was generated by <a href="http://RDFReactor.ontoware.org">RDFReactor</a> on 19.12.06 14:46
 * Schema Comment: This class acts as a catch-all for all properties, for which no domain has specified.
 */
public class Thing extends org.ontoware.rdfreactor.schema.rdfschema.Class {

    /** http://www.w3.org/2000/01/rdf-schema#Class */
	public static final URI RDFS_CLASS = URIImpl.createURIWithoutChecking("http://www.w3.org/2000/01/rdf-schema#Class");

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
 
    };

	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected Thing ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	public Thing ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public Thing ( Model model, URI uri ) {
		this(model, uri, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString A URI of this instance, represented as a String
	 * @throws ModelRuntimeException if URI syntax is wrong
	 */
	public Thing ( Model model, String uriString ) throws ModelRuntimeException {
		this(model, URIImpl.create(uriString), true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public Thing ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public Thing ( Model model ) {
		this(model, model.newRandomUniqueURI(), true);
	}


    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @param model RDF2GO model
	 * @param uri instance identifier
	 * @return an instance of Thing or null if none existst
	 * @throws Exception if Model causes problems
	 */
	public static Thing getInstance(Model model, URI uri) throws Exception {
		return (Thing) getInstance(model, uri, Thing.class);
	}

	/**
	 * @return all instances of this class
	 */
	public Thing[] getAllInstances() {
		return (Thing[]) getAllInstances(super.model, Thing.class);
	}

	/**
	 * @return all instances of this class in the given Model
	 * @param model an RDF2Go model
	 */
	public static Thing[] getAllInstances(Model model) {
		return (Thing[]) getAllInstances(model, Thing.class);
	}
 }

  
  