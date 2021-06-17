package edu.vanderbilt.cs.oo;

public class CompositeNode implements Node{

    private Node leftChild = new NullNode();

    private Node rightChild = new NullNode();

    private Node parent;

    private Double value;

    public CompositeNode(double value){
        this.value = value;
        this.leftChild.setParent(this);
        this.rightChild.setParent(this);
    }

    @Override
    public void setValue(Double d) {
        this.value = d;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public void setParent(Node n) {
        this.parent = n;
    }

    @Override
    public Node getParent() {
        return parent;
    }


    @Override
    public void replace(Node child, Node replacement) {
        if(child == this.leftChild){
            this.leftChild = replacement;
            this.leftChild.setParent(this);
        }
        if(child == this.rightChild){
            this.rightChild = replacement;
            this.rightChild.setParent(this);
        }
    }

    @Override
    public Node getLeftChild() {
        return leftChild;
    }

    @Override
    public Node getRightChild() {
        return rightChild;
    }
    
}
