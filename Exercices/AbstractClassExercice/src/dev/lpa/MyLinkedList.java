package dev.lpa;

public class MyLinkedList implements NodeList {
    // write code here
    private ListItem root;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot(){
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(root == null){
            root = item;
        }

        if(root.compareTo(item) == 0){
            return false;
        }

        if(root.compareTo(item) < 0){

        }

            return false;
    }

//    addItem(), takes a ListItem and returns true
//            if it was added successfully or false otherwise.
//    If the item is already present, it doesn't get added.
//    Use compareTo() to place the item in its proper order.
//
//    The rules for adding an item to the linked tree are:
//
//    If the head of the tree is null, make the head refer to the item to be added.
//
//    If the item to be added is less than the current item in the tree,
//    add the item before
//    the current item (i.e., make the previous item's "next" refer to the new item,
//            and the new item's "next" refer to the current item).
//
//            If the item to be added is greater than the current item,
//                      move onto the next item and compare again (if there is no next item,
//                      then that is where the new item belongs).



    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
