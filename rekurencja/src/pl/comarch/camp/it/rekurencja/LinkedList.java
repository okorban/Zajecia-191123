package pl.comarch.camp.it.rekurencja;


public class LinkedList {
    private Node first;
    private int size = 0;

    public void add(String s){
        if(first == null){
            Node node = new Node();
            node.value = s;
            this.first = node;
            this.size ++;
        } else {
            addNextToNode(this.first, s);


        }
    }

    private void addNextToNode(Node node, String s){
        if(node.next == null){
            Node newNode = new Node();
            newNode.value = s;
            node.next = newNode;
            this.size ++;
        }
        else {
            addNextToNode(node.next, s);
        }

    }

    public String get(int index){
        if(this.size == 0 || index >= this.size){
            return null;
        }
        if( index == 0){
            return this.first.value;
        } else return getNNodeValue(this.first, index);
    }

    private String getNNodeValue(Node node, int n){
        if(node == null){
            return null;
        }
        if(n == 0){
            return node.value;
        } else {
            return getNNodeValue(node.next, n - 1);
        }

    }

    public int size(){
        if(this.first == null){
            return 0;
        }
        return tailLength(this.first);

    }

    private int tailLength(Node node){
        if(node.next == null){
            return 1;
        }
        return 1 + tailLength(node.next);
    }

    public int betterSize(){
        return this.size;
    }
}
