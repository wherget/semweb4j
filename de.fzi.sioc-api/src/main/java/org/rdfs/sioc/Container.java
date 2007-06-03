
/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 785 2007-05-31 15:47:01Z voelkel $) on 01.06.07 18:30
 */
package org.rdfs.sioc;

import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.exception.ModelRuntimeException;

import org.ontoware.rdfreactor.runtime.RDFDataException;


/**
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 01.06.07 18:30
 * This class manages access to these properties:
 * <ul>
 *   <li> Containerof </li>
 *   <li> Subscriber </li>
 *   <li> Parent </li>
 *   <li> Owner </li>
 *   <li> Parentof </li>
 * </ul>
 * Schema Comment: An area in which content Items are contained.
 */
public class Container extends Thing {

    /** http://rdfs.org/sioc/ns#Container */
	public static final URI RDFS_CLASS = new URIImpl("http://rdfs.org/sioc/ns#Container", false);

    /** http://rdfs.org/sioc/ns#container_of */
	public static final URI CONTAINEROF = new URIImpl("http://rdfs.org/sioc/ns#container_of",false);

    /** http://rdfs.org/sioc/ns#has_subscriber */
	public static final URI SUBSCRIBER = new URIImpl("http://rdfs.org/sioc/ns#has_subscriber",false);

    /** http://rdfs.org/sioc/ns#has_parent */
	public static final URI PARENT = new URIImpl("http://rdfs.org/sioc/ns#has_parent",false);

    /** http://rdfs.org/sioc/ns#has_owner */
	public static final URI OWNER = new URIImpl("http://rdfs.org/sioc/ns#has_owner",false);

    /** http://rdfs.org/sioc/ns#parent_of */
	public static final URI PARENTOF = new URIImpl("http://rdfs.org/sioc/ns#parent_of",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://rdfs.org/sioc/ns#container_of",false),
      new URIImpl("http://rdfs.org/sioc/ns#has_subscriber",false),
      new URIImpl("http://rdfs.org/sioc/ns#has_parent",false),
      new URIImpl("http://rdfs.org/sioc/ns#has_owner",false),
      new URIImpl("http://rdfs.org/sioc/ns#parent_of",false) 
    };

	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected Container ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	public Container ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public Container ( Model model, URI uri ) {
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
	public Container ( Model model, String uriString ) throws ModelRuntimeException {
		this(model, new URIImpl(uriString), true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public Container ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public Container ( Model model ) {
		this(model, model.newRandomUniqueURI(), true);
	}


    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @param model RDF2Go model
	 * @param uri instance identifier
	 * @return an instance of Container or null if none existst
	 * @throws Exception if Model causes problems
	 */
	public static Container getInstance(Model model, URI uri) throws Exception {
		return (Container) getInstance(model, uri, Container.class);
	}

	/**
	 * @param model
	 * @param uri
	 * @return true if uri is an instance of this class in the model
	 */
	public static boolean hasInstance(Model model, URI uri) {
		return hasInstance(model, uri, RDFS_CLASS);
	}

	/**
	 * @return all instances of this class
	 */
	public Container[] getAllInstances() {
		return (Container[]) getAllInstances(super.model, Container.class);
	}

	/**
	 * @return all instances of this class in the given Model
	 * @param model an RDF2Go model
	 */
	public static Container[] getAllInstances(Model model) {
		return (Container[]) getAllInstances(model, Container.class);
	}

	/**
	 * @return all A's that have a relation 'Parent' to this Container instance
	 */
	public Container[] getAllSiocParent_Inverse() {
		return (Container[]) getAll_Inverse(Container.PARENT, this.getResource(), Container.class);
	}

	/**
	 * add 'Parent'-Inverse
	 * @param value
	 */
	public void addSiocParent_Inverse(Container value) {
		value.add( Container.PARENT ,this);
	}


	/**
	 * @return all A's that have a relation 'Parentof' to this Container instance
	 */
	public Container[] getAllSiocParentof_Inverse() {
		return (Container[]) getAll_Inverse(Container.PARENTOF, this.getResource(), Container.class);
	}

	/**
	 * add 'Parentof'-Inverse
	 * @param value
	 */
	public void addSiocParentof_Inverse(Container value) {
		value.add( Container.PARENTOF ,this);
	}


	/**
	 * @return all A's that have a relation 'Container' to this Container instance
	 */
	public Item[] getAllSiocContainer_Inverse() {
		return (Item[]) getAll_Inverse(Item.CONTAINER, this.getResource(), Item.class);
	}

	/**
	 * add 'Container'-Inverse
	 * @param value
	 */
	public void addSiocContainer_Inverse(Item value) {
		value.add( Item.CONTAINER ,this);
	}


	/**
	 * @return all A's that have a relation 'Ownerof' to this Container instance
	 */
	public User[] getAllSiocOwnerof_Inverse() {
		return (User[]) getAll_Inverse(User.OWNEROF, this.getResource(), User.class);
	}

	/**
	 * add 'Ownerof'-Inverse
	 * @param value
	 */
	public void addSiocOwnerof_Inverse(User value) {
		value.add( User.OWNEROF ,this);
	}


	/**
	 * @return all A's that have a relation 'Subscriberof' to this Container instance
	 */
	public User[] getAllSiocSubscriberof_Inverse() {
		return (User[]) getAll_Inverse(User.SUBSCRIBEROF, this.getResource(), User.class);
	}

	/**
	 * add 'Subscriberof'-Inverse
	 * @param value
	 */
	public void addSiocSubscriberof_Inverse(User value) {
		value.add( User.SUBSCRIBEROF ,this);
	}



    /**
     * Schema Comment: An Item that this Container contains.
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public Item getSiocContainerof() {
		return (Item) get(CONTAINEROF, Item.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: An Item that this Container contains.
	 */
	public void setSiocContainerof( Item value ) {
		set(CONTAINEROF, value);
	}

 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: An Item that this Container contains.
	 */
	public void removeSiocContainerof( Item value  ) {
		remove(CONTAINEROF, value);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, CONTAINEROF, value)
	 */
	public boolean hasSiocContainerof( Item value) {
		return hasValue(CONTAINEROF, value);
	}

	/**
	 * @return true if the model contains a statement (this, CONTAINEROF, *)
	 */
	public boolean hasSiocContainerof() {
		return hasValue(CONTAINEROF);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: An Item that this Container contains.
	 */
	public void addSiocContainerof( Item value  ) {
		add(CONTAINEROF, value );
	}

	/**
	 * @return all values
     * Schema Comment: An Item that this Container contains.
	 */
	public Item[] getAllSiocContainerof() {
		return (Item[]) getAll(CONTAINEROF, Item.class);
	}
  

    /**
     * Schema Comment: A User who is subscribed to this Container.
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public User getSiocSubscriber() {
		return (User) get(SUBSCRIBER, User.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: A User who is subscribed to this Container.
	 */
	public void setSiocSubscriber( User value ) {
		set(SUBSCRIBER, value);
	}

 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: A User who is subscribed to this Container.
	 */
	public void removeSiocSubscriber( User value  ) {
		remove(SUBSCRIBER, value);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, SUBSCRIBER, value)
	 */
	public boolean hasSiocSubscriber( User value) {
		return hasValue(SUBSCRIBER, value);
	}

	/**
	 * @return true if the model contains a statement (this, SUBSCRIBER, *)
	 */
	public boolean hasSiocSubscriber() {
		return hasValue(SUBSCRIBER);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: A User who is subscribed to this Container.
	 */
	public void addSiocSubscriber( User value  ) {
		add(SUBSCRIBER, value );
	}

	/**
	 * @return all values
     * Schema Comment: A User who is subscribed to this Container.
	 */
	public User[] getAllSiocSubscriber() {
		return (User[]) getAll(SUBSCRIBER, User.class);
	}
  

    /**
     * Schema Comment: A Container (or Forum) that this Container (or Forum) is a child of.
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public Container getSiocParent() {
		return (Container) get(PARENT, Container.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: A Container (or Forum) that this Container (or Forum) is a child of.
	 */
	public void setSiocParent( Container value ) {
		set(PARENT, value);
	}

 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: A Container (or Forum) that this Container (or Forum) is a child of.
	 */
	public void removeSiocParent( Container value  ) {
		remove(PARENT, value);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, PARENT, value)
	 */
	public boolean hasSiocParent( Container value) {
		return hasValue(PARENT, value);
	}

	/**
	 * @return true if the model contains a statement (this, PARENT, *)
	 */
	public boolean hasSiocParent() {
		return hasValue(PARENT);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: A Container (or Forum) that this Container (or Forum) is a child of.
	 */
	public void addSiocParent( Container value  ) {
		add(PARENT, value );
	}

	/**
	 * @return all values
     * Schema Comment: A Container (or Forum) that this Container (or Forum) is a child of.
	 */
	public Container[] getAllSiocParent() {
		return (Container[]) getAll(PARENT, Container.class);
	}
  

    /**
     * Schema Comment: A User that this Container is owned by.
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public User getSiocOwner() {
		return (User) get(OWNER, User.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: A User that this Container is owned by.
	 */
	public void setSiocOwner( User value ) {
		set(OWNER, value);
	}

 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: A User that this Container is owned by.
	 */
	public void removeSiocOwner( User value  ) {
		remove(OWNER, value);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, OWNER, value)
	 */
	public boolean hasSiocOwner( User value) {
		return hasValue(OWNER, value);
	}

	/**
	 * @return true if the model contains a statement (this, OWNER, *)
	 */
	public boolean hasSiocOwner() {
		return hasValue(OWNER);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: A User that this Container is owned by.
	 */
	public void addSiocOwner( User value  ) {
		add(OWNER, value );
	}

	/**
	 * @return all values
     * Schema Comment: A User that this Container is owned by.
	 */
	public User[] getAllSiocOwner() {
		return (User[]) getAll(OWNER, User.class);
	}
  

    /**
     * Schema Comment: A child Container (or Forum) that this Container (or Forum) is a parent of.
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public Container getSiocParentof() {
		return (Container) get(PARENTOF, Container.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: A child Container (or Forum) that this Container (or Forum) is a parent of.
	 */
	public void setSiocParentof( Container value ) {
		set(PARENTOF, value);
	}

 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: A child Container (or Forum) that this Container (or Forum) is a parent of.
	 */
	public void removeSiocParentof( Container value  ) {
		remove(PARENTOF, value);
	}
 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, PARENTOF, value)
	 */
	public boolean hasSiocParentof( Container value) {
		return hasValue(PARENTOF, value);
	}

	/**
	 * @return true if the model contains a statement (this, PARENTOF, *)
	 */
	public boolean hasSiocParentof() {
		return hasValue(PARENTOF);
	}

 
	/**
	 * adds a value
	 * @param value the value to be added
     * Schema Comment: A child Container (or Forum) that this Container (or Forum) is a parent of.
	 */
	public void addSiocParentof( Container value  ) {
		add(PARENTOF, value );
	}

	/**
	 * @return all values
     * Schema Comment: A child Container (or Forum) that this Container (or Forum) is a parent of.
	 */
	public Container[] getAllSiocParentof() {
		return (Container[]) getAll(PARENTOF, Container.class);
	}
   
}

  
  
