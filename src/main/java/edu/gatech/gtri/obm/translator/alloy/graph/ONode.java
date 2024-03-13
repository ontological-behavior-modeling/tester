package edu.gatech.gtri.obm.translator.alloy.graph;

import java.util.ArrayList;
import java.util.List;
import org.graphstream.graph.Node;

// TODO: Auto-generated Javadoc
/** The Class ONode. */
public class ONode implements IObject {

  /** The node attribute name. */
  public static String node_attribute_name = "name";

  /** The type. */
  public static String type = "type";

  /** The n. */
  Node n;

  /** The num one of. */
  int numOneOf = 0;

  /**
   * Instantiates a new o node.
   *
   * <p><img src="doc-files/ONode2.svg"/>
   *
   * @param _n the n
   * @param oneof the oneof
   */
  public ONode(Node _n, boolean oneof) {
    this.n = _n;
    numOneOf++;
  }

  /**
   * Gets the num one of.
   *
   * @return the num one of
   */
  public int getNumOneOf() {
    return this.numOneOf;
  }

  /**
   * Instantiates a new o node.
   *
   * <p><img src="doc-files/ONode1.svg"/>
   *
   * @param _n the n
   */
  public ONode(Node _n) {
    this.n = _n;
  }

  /**
   * Minus one of.
   *
   * <p><img src="doc-files/ONode_minusOneOf.svg"/>
   *
   * @return the int
   */
  public int minusOneOf() {
    this.numOneOf--;
    return numOneOf;
  }

  /**
   * Plus one of.
   *
   * <p><img src="doc-files/ONode_plusOneOf.svg"/>
   *
   * @return the int
   */
  public int plusOneOf() {
    this.numOneOf++;
    return numOneOf;
  }

  /**
   * To string.
   *
   * <p><img src="doc-files/ONode_toString.svg"/>
   *
   * <p>{@link edu.gatech.gtri.obm.translator.alloy.graph.ONode#getName()}
   *
   * @return the string
   */
  public String toString() {
    return getName();
  }

  /**
   * Gets the name.
   *
   * <p><img src="doc-files/ONode_getName.svg"/>
   *
   * @return the name
   */
  public String getName() {
    return (String) n.getAttribute(node_attribute_name);
  }

  /**
   * Gets the type.
   *
   * <p><img src="doc-files/ONode_getType.svg"/>
   *
   * @return the type
   */
  public String getType() {
    return (String) n.getAttribute(type);
  }

  /**
   * Gets the node.
   *
   * <p><img src="doc-files/ONode_getNode.svg"/>
   *
   * @return the node
   */
  public Node getNode() {
    return this.n;
  }

  /**
   * To string alloy.
   *
   * <p><img src="doc-files/ONode_toStringAlloy.svg"/>
   *
   * @return the list
   */
  @Override
  public List<String> toStringAlloy() {
    List<String> l = new ArrayList<>();
    l.add(this.getName());
    return l;
  }

  /** Sort. */
  // do nothing
  public void sort() {
    return;
  }
}
