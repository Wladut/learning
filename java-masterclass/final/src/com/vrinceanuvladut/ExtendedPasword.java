package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 31-08-2020
 * Time 7:16 PM
 */

public class ExtendedPasword extends Password{
    private int decryptedPassword;

    public ExtendedPasword(int password) {
        super(password);
        this.decryptedPassword = password;
    }


    // eroare la override deoarece storePassword e marcata acum ca fiind final
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
