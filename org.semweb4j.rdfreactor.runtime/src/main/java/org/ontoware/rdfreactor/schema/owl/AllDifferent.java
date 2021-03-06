/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 870
 * 2007-11-07 17:30:59Z max.at.xam.de $) on 26.01.08 12:47
 */
package org.ontoware.rdfreactor.schema.owl;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;
import org.ontoware.rdfreactor.schema.rdfs.List;


/**
 * This class manages access to these properties:
 * <ul>
 * <li>DistinctMembers</li>
 * </ul>
 * 
 * This class was generated by <a
 * href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 26.01.08 12:47
 */
public class AllDifferent extends OwlThing {
	
	/**
     * 
     */
	private static final long serialVersionUID = 1L;
	
	/** http://www.w3.org/2002/07/owl#AllDifferent */
	public static final URI RDFS_CLASS = new URIImpl("http://www.w3.org/2002/07/owl#AllDifferent",
	        false);
	
	/** http://www.w3.org/2002/07/owl#distinctMembers */
	public static final URI DISTINCTMEMBERS = new URIImpl(
	        "http://www.w3.org/2002/07/owl#distinctMembers", false);
	
	/** all property-URIs with this class as domain */
	public static final URI[] MANAGED_URIS = { new URIImpl(
	        "http://www.w3.org/2002/07/owl#distinctMembers", false) };
	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI. Creating
	 * two wrappers for the same instanceURI is legal.
	 * 
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to
	 *            the model
	 * 
	 *            [Generated from RDFReactor template rule #c1]
	 */
	protected AllDifferent(Model model, URI classURI,
	        org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write) {
		super(model, classURI, instanceIdentifier, write);
	}
	
	// public constructors
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI. Creating
	 * two wrappers for the same instanceURI is legal.
	 * 
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to
	 *            the model
	 * 
	 *            [Generated from RDFReactor template rule #c2]
	 */
	public AllDifferent(Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier,
	        boolean write) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by a URI, given as
	 * a String. Creating two wrappers for the same URI is legal.
	 * 
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString a URI given as a String
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to
	 *            the model
	 * @throws ModelRuntimeException if URI syntax is wrong
	 * 
	 *             [Generated from RDFReactor template rule #c7]
	 */
	public AllDifferent(Model model, String uriString, boolean write) throws ModelRuntimeException {
		super(model, RDFS_CLASS, new URIImpl(uriString, false), write);
	}
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * 
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to
	 *            the model
	 * 
	 *            [Generated from RDFReactor template rule #c8]
	 */
	public AllDifferent(Model model, BlankNode bnode, boolean write) {
		super(model, RDFS_CLASS, bnode, write);
	}
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by a randomly
	 * generated URI. Creating two wrappers results in different URIs.
	 * 
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to
	 *            the model
	 * 
	 *            [Generated from RDFReactor template rule #c9]
	 */
	public AllDifferent(Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}
	
	// /////////////////////////////////////////////////////////////////
	// typing
	
	/**
	 * Create a new instance of this class in the model. That is, create the
	 * statement (instanceResource, RDF.type,
	 * http://www.w3.org/2002/07/owl#AllDifferent).
	 * 
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * 
	 *            [Generated from RDFReactor template rule #class1]
	 */
	public static void createInstance(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.createInstance(model, RDFS_CLASS, instanceResource);
	}
	
	/**
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return true if instanceResource is an instance of this class in the
	 *         model
	 * 
	 *         [Generated from RDFReactor template rule #class2]
	 */
	public static boolean hasInstance(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.hasInstance(model, RDFS_CLASS, instanceResource);
	}
	
	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as RDF resources
	 * 
	 *         [Generated from RDFReactor template rule #class3]
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllInstances(
	        Model model) {
		return Base.getAllInstances(model, RDFS_CLASS,
		        org.ontoware.rdf2go.model.node.Resource.class);
	}
	
	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as a ReactorResult,
	 *         which can conveniently be converted to iterator, list or array.
	 * 
	 *         [Generated from RDFReactor template rule #class3-as]
	 */
	public static ReactorResult<? extends AllDifferent> getAllInstance_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, AllDifferent.class);
	}
	
	/**
	 * Delete all rdf:type from this instance. Other triples are not affected.
	 * 
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * 
	 *            [Generated from RDFReactor template rule #class4]
	 */
	public static void deleteInstance(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteInstance(model, RDFS_CLASS, instanceResource);
	}
	
	// /////////////////////////////////////////////////////////////////
	// property access methods
	
	/**
	 * Get all values of property DistinctMembers as an Iterator over RDF2Go
	 * nodes
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @return a ClosableIterator of RDF2Go Nodes
	 * 
	 *         [Generated from RDFReactor template rule #get7static]
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllDistinctMembers_asNode(
	        Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, DISTINCTMEMBERS);
	}
	
	/**
	 * Get all values of property DistinctMembers as a ReactorResult of RDF2Go
	 * nodes
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @return a List of RDF2Go Nodes
	 * 
	 *         [Generated from RDFReactor template rule
	 *         #get7static-reactor-result]
	 */
	public static ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllDistinctMembers_asNode_(
	        Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, DISTINCTMEMBERS,
		        org.ontoware.rdf2go.model.node.Node.class);
	}
	
	/**
	 * Get all values of property DistinctMembers as an Iterator over RDF2Go
	 * nodes
	 * 
	 * @return a ClosableIterator of RDF2Go Nodes
	 * 
	 *         [Generated from RDFReactor template rule #get8dynamic]
	 */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllDistinctMembers_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), DISTINCTMEMBERS);
	}
	
	/**
	 * Get all values of property DistinctMembers as a ReactorResult of RDF2Go
	 * nodes
	 * 
	 * @return a List of RDF2Go Nodes
	 * 
	 *         [Generated from RDFReactor template rule
	 *         #get8dynamic-reactor-result]
	 */
	public ReactorResult<org.ontoware.rdf2go.model.node.Node> getAllDistinctMembers_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), DISTINCTMEMBERS,
		        org.ontoware.rdf2go.model.node.Node.class);
	}
	
	/**
	 * Get all values of property DistinctMembers * @param model an RDF2Go model
	 * 
	 * @param resource an RDF2Go resource
	 * @return a ClosableIterator of $type
	 * 
	 *         [Generated from RDFReactor template rule #get11static]
	 */
	public static ClosableIterator<List> getAllDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, DISTINCTMEMBERS, List.class);
	}
	
	/**
	 * Get all values of property DistinctMembers as a ReactorResult of List
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @return a ReactorResult of $type which can conveniently be converted to
	 *         iterator, list or array
	 * 
	 *         [Generated from RDFReactor template rule
	 *         #get11static-reactorresult]
	 */
	public static ReactorResult<List> getAllDistinctMembers_as(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, DISTINCTMEMBERS, List.class);
	}
	
	/**
	 * Get all values of property DistinctMembers * @return a ClosableIterator
	 * of $type
	 * 
	 * [Generated from RDFReactor template rule #get12dynamic]
	 */
	public ClosableIterator<List> getAllDistinctMembers() {
		return Base.getAll(this.model, this.getResource(), DISTINCTMEMBERS, List.class);
	}
	
	/**
	 * Get all values of property DistinctMembers as a ReactorResult of List
	 * 
	 * @return a ReactorResult of $type which can conveniently be converted to
	 *         iterator, list or array
	 * 
	 *         [Generated from RDFReactor template rule
	 *         #get12dynamic-reactorresult]
	 */
	public ReactorResult<List> getAllDistinctMembers_as() {
		return Base.getAll_as(this.model, this.getResource(), DISTINCTMEMBERS, List.class);
	}
	
	/**
	 * Adds a value to property DistinctMembers as an RDF2Go node
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @param value the value to be added
	 * 
	 *            [Generated from RDFReactor template rule #add1static]
	 */
	public static void addDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource,
	        org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Adds a value to property DistinctMembers as an RDF2Go node
	 * 
	 * @param value the value to be added
	 * 
	 *            [Generated from RDFReactor template rule #add1dynamic]
	 */
	public void addDistinctMembers(org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Adds a value to property DistinctMembers from an instance of List
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * 
	 *            [Generated from RDFReactor template rule #add3static]
	 */
	public static void addDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource, List value) {
		Base.add(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Adds a value to property DistinctMembers from an instance of List
	 * 
	 * [Generated from RDFReactor template rule #add4dynamic]
	 */
	public void addDistinctMembers(List value) {
		Base.add(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Sets a value of property DistinctMembers from an RDF2Go node. First, all
	 * existing values are removed, then this value is added. Cardinality
	 * constraints are not checked, but this method exists only for properties
	 * with no minCardinality or minCardinality == 1.
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @param value the value to be set
	 * 
	 *            [Generated from RDFReactor template rule #set1static]
	 */
	public static void setDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource,
	        org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Sets a value of property DistinctMembers from an RDF2Go node. First, all
	 * existing values are removed, then this value is added. Cardinality
	 * constraints are not checked, but this method exists only for properties
	 * with no minCardinality or minCardinality == 1.
	 * 
	 * @param value the value to be added
	 * 
	 *            [Generated from RDFReactor template rule #set1dynamic]
	 */
	public void setDistinctMembers(org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Sets a value of property DistinctMembers from an instance of List First,
	 * all existing values are removed, then this value is added. Cardinality
	 * constraints are not checked, but this method exists only for properties
	 * with no minCardinality or minCardinality == 1.
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @param value the value to be added
	 * 
	 *            [Generated from RDFReactor template rule #set3static]
	 */
	public static void setDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource, List value) {
		Base.set(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Sets a value of property DistinctMembers from an instance of List First,
	 * all existing values are removed, then this value is added. Cardinality
	 * constraints are not checked, but this method exists only for properties
	 * with no minCardinality or minCardinality == 1.
	 * 
	 * @param value the value to be added
	 * 
	 *            [Generated from RDFReactor template rule #set4dynamic]
	 */
	public void setDistinctMembers(List value) {
		Base.set(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Removes a value of property DistinctMembers as an RDF2Go node
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 * 
	 *            [Generated from RDFReactor template rule #remove1static]
	 */
	public static void removeDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource,
	        org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Removes a value of property DistinctMembers as an RDF2Go node
	 * 
	 * @param value the value to be removed
	 * 
	 *            [Generated from RDFReactor template rule #remove1dynamic]
	 */
	public void removeDistinctMembers(org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Removes a value of property DistinctMembers given as an instance of List
	 * 
	 * @param model an RDF2Go model
	 * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 * 
	 *            [Generated from RDFReactor template rule #remove3static]
	 */
	public static void removeDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource, List value) {
		Base.remove(model, instanceResource, DISTINCTMEMBERS, value);
	}
	
	/**
	 * Removes a value of property DistinctMembers given as an instance of List
	 * 
	 * @param value the value to be removed
	 * 
	 *            [Generated from RDFReactor template rule #remove4dynamic]
	 */
	public void removeDistinctMembers(List value) {
		Base.remove(this.model, this.getResource(), DISTINCTMEMBERS, value);
	}
	
	/**
	 * Removes all values of property DistinctMembers * @param model an RDF2Go
	 * model
	 * 
	 * @param resource an RDF2Go resource
	 * 
	 *            [Generated from RDFReactor template rule #removeall1static]
	 */
	public static void removeAllDistinctMembers(Model model,
	        org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, DISTINCTMEMBERS);
	}
	
	/**
	 * Removes all values of property DistinctMembers * [Generated from
	 * RDFReactor template rule #removeall1dynamic]
	 */
	public void addDistinctMembers() {
		Base.removeAll(this.model, this.getResource(), DISTINCTMEMBERS);
	}
}
