public class Node<T> {
    private T data;
    private Node parent;
    private Node child;

    public Node(){ //default constructor
    }

    //data constructor
    public Node(T data){
        this.data = data;
    }

    // data and parent/child node constructor
    public Node(T data, Node parent, Node child){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    //sets data
    public void setData(T data){
        this.data = data;
    }

    //sets parent node
    public void setParent(Node parent){
        this.parent = parent;
    }

    //sets child node
    public void setChild(Node child){
        this.child = child;
    }

    //sets child to parent
    public void makeChild(Node parent){
        parent.child = this;
    }

    //makes parent to child
    public void makeParent(Node child){
        child.parent = this;
    }

    //returns data
    public T getData(){
        return data;
    }

    //returns parent
    public Node getParent(){
        return parent;
    }

    //returns child
    public Node getChild(){
        return child;
    }

    //overrides toString
    @Override
    public String toString(){
        return "Node: "+data.toString();
    }

    //new equals method
    public boolean equals(Node userNode) {
        return this.data.equals(userNode.getData());
    }



}