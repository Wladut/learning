package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 30-08-2020
 * Time 11:11 PM
 */

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;

        //XOR - Sets each bit to 1 if only one of the two bits is 1
    }

    // Daca marcam storePassword() ca fiind final atunci nu se mai poate face override pe ea
    // in clasa care extinde Password class.

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come  in");
            return false;
        }
    }
}
