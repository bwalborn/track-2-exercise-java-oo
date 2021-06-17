package edu.vanderbilt.cs.oo;

public class NullNode implements Node{

    private Node parent;

    @Override
    public void setValue(Double d) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double getValue() {
        return 0.0;
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void replace(Node child, Node replacement) {}

    @Override
    public Node getLeftChild() {
        return null;
    }

    @Override
    public Node getRightChild() {
        return null;
    }
    
}
