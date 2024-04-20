package dev.lpa;

public class Node extends ListItem {
    // write code here
    public Node(Object value){
        super(value);
    }

    @Override
    public ListItem next(){
        return rightLink;
    }

    @Override
    public ListItem setNext(ListItem item){
        item = item.rightLink;
        return item;
    }

    @Override
    public ListItem previous(){
        return leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem item){
        item = item.leftLink;
        return item;
    }

    @Override
    public int compareTo(ListItem item){
        int val1 = Integer.parseInt(String.valueOf(this.getValue()));
        int val2 = Integer.parseInt(String.valueOf(item.getValue()));
        if(val1 > val2){
            return 1;
        }
        else if(val1 < val2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
