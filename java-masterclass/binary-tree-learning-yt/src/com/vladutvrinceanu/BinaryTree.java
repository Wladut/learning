package com.vladutvrinceanu;

public class BinaryTree {

    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        }else{
            Node focusNode = root;

            Node parent;

            while(true){
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;   //this is the part where the left is incremented
                    if(focusNode == null){             // if this is not true , so has left then go again into the while loop but with left children of the root
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode){
        if (focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);                  // visit higher value than left child;
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode){
        if (focusNode != null){
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key){
        Node focusNode  = root;
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;

            }else{
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pres");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75,"Sales Manager");
        theTree.addNode(85, "Salesmen 1");

        //theTree.inOrderTraverseTree(theTree.root);
        // start from left smallest and go until right higher:
        // 15, 25, 30, 50, 75, 85

        //theTree.preorderTraverseTree(theTree.root);
        // start from root to left and after that to right;
        // 50, 25, 15, 30, 75, 85

        theTree.postOrderTraverseTree(theTree.root);
        // 15, 30, 25, 85, 75, 50

        System.out.println("Search for 30");
        System.out.println(theTree.findNode(30));


    }

}

class Node{

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + " has a key " + key;
    }


}
