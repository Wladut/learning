package com.vladutvrinceanu;

abstract class ListItem {

    // in an abstract class you can have an object created with the same name like rightLink and leftLink are.

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    //Object class instance. Object is the main class java.lang if an class is not extending any class
    //then is extended from Object

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
