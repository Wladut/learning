package com.vladutvrinceanu;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparision = (currentItem.compareTo(newItem));
            if(comparision < 0){
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else{
                    // there is no next, so insert at end of list
                    //currentItem.setNext(newItem);
                    //newItem.setPrevious(currentItem);
                    //or as shortcut:

                    //Explaining: because setNext implemented in Node is returning the object which hass setPrevious method
                    //Also as I see, if method from abstract class is implemented in another class then I think ListItem will have
                    //the implementation from that class. Unsure about this!!!

                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparision > 0){
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous()); //same change
                    newItem.setNext(currentItem).setPrevious(newItem); //same change
                } else {
                    // the node with  a  previous is  the root
                    newItem.setNext(this.root).setPrevious(newItem);    //same change
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparision = currentItem.compareTo(item);
            //compareTo return <0 if it is greater
            //>0 if it is less
            //equal with 0 if is the same
            if(comparision == 0){
                //found item to delete
                if(currentItem.equals(this.root)){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparision < 0){
                currentItem = currentItem.next();
            }else{
                //comparision > 0
                // We are at an item greater than one to be deleted
                // so the  item   is not in the list
                return false;
            }
        }

        // We have reached the end of the list
        // Without finding the item to delete;
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }

        }

        //rewritten with search tree, but is not a good idea because it will crash because of overflow and recursive
//        if(root != null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
