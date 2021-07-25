package com.vrinceanuvladut;

import sun.reflect.generics.scope.Scope;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

     //  ScopeCheck.InnerClass innerClass = new ScopeCheck.InnerClass(); // public static class
     //   ScopeCheck.InnerClass innerClass = new ScopeCheck().new InnerClass(); // public class
        // can't access members from the outer class, but first instance does.

        System.out.println("************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();

        innerClass.timesTwo();

    }
}
