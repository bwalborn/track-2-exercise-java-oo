package edu.vanderbilt.cs.oo;

public class NodeFactory {

    /**
     * @ToDo
     *
     * Update this to return an instance of your CompositeNode
     *
     * @return
     */
    public Node newCompositeNode(Double v){
        return new CompositeNode(v);
    }

    /**
     * @ToDo
     *
     * Update this to return an instance of your NullNode
     *
     * @return
     */
    public Node newNullNode(){
        return new NullNode();
    }

}
