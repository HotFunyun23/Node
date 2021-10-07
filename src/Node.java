public class Node<T> {
    private T data;
    private Node parent;
    private Node child;

    public Node(){
    }

    public Node(T data){
        this.data = data;
    }

    public Node(T data, Node parent, Node child){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setParent(Node parent){
        this.parent = parent;
    }

    public void setChild(Node child){
        this.child = child;
    }

    public void makeChild(Node parent){
        parent.child = this;
    }

    public void makeParent(Node child){
        child.parent = this;
    }

    public T getData(){
        return data;
    }

    public Node getParent(){
        return parent;
    }

    public Node getChild(){
        return child;
    }

    public String toString(){
        return "Node: "+data.toString();
    }

    public boolean equals(Node userNode) {
        return this.data.equals(userNode.getData());
    }



}