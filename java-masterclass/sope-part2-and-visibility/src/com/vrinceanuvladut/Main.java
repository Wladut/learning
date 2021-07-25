package com.vrinceanuvladut;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree);       // daca varThree e privat
        // nu se poate accesa aici in main class. daca e public poate fi

//        scopeInstance.useInner();
//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//
//        System.out.println("************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//
//        innerClass.timesTwo();

    }
}
