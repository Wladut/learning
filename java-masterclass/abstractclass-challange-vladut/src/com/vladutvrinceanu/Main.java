package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {



//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//	    //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String stringData = "5 7 3 9 8 2 1 0 4 6";  //for simplicity
//	    String[] data = stringData.split(" ");
//	    //split method returns a string array including ndividual items
//	    for(String s: data){
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//
//	    list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());


        //For Search Tree

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";  //for simplicity
        String[] data = stringData.split(" ");
        //split method returns a string array including ndividual items
        for(String s: data){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());


    }
}
