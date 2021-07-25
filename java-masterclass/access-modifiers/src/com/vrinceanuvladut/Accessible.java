package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 30-08-2020
 * Time 2:11 AM
 */

// Challange:
// In the  following interface declaration, what is  the  visibility of:
//
// 1. the  Accessible interface?
//  Private-package;
    //  Tim: is  private-package -> available in all classes within  package com.vrinceanuvladut
// 2. the int variable SOME_CONSTANT?
//  private-package
    //  Tim: public all are  public  static  final
// 3. methodA?
//  public
    //  Tim:  public
// 4. methodB and methodC?
//  private-package
// Tim: public -> all  interfaces methods are default public because interfaces does not have
// package  private

// Can't have  anything except public methods in   interface.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

}
