package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 12-09-2020
 * Time 1:30 PM
 */

/****************************************

/**
 * When overriding the equals() method in the HeavenlyBody  class, we
 * were careful to make sure that it would not return true if a HeavenlyBody
 * was compared to a subclass of itself.
 *
 * We did that to demonstrate that method, but  it was actually
 * unnecessary in the  HeavenlyBody class.
 *
 * The mini challenge is just a question: why was it unnecessary?
 *
 * Hint: If you are stuck, check out Lecture 97 (about OOP burger class extended, so methods are
 * inherited from base class)
 */

/**
 * My answer:
 * Because HeavenlyBody class is made final, so actually subclasses cannot be created, no inheritance.
 */

/****************************************


/**
 * Here my answer reason:
 */
/**
public class Challenge extends HeavenlyBody{
    public Challenge(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }
 */


/**
 * Tim response:
 * The HeavenlyBody is declared final, so cannot be subclassed. (my response is right)
 * Additional: The Java String class is also final, which is why it can safely
 * use the instanceof method without having to worry about
 * comparisons with a subclass
 *
 */

public class Challenge{


}
