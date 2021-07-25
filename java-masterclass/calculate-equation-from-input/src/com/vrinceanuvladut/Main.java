package com.vrinceanuvladut;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String stringEquationInput = scanner.nextLine();
        System.out.println(calculateEquation(stringEquationInput));
    }

    public static int calculateEquation(String equation){
        String[] equationList = equation.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        int sum = 0;
        int start = 0;
        if(equationList[0].equals("+")){
            sum += Integer.parseInt(equationList[1]);
            start = 2;
        } else if(equationList[0].equals("-")){
            sum -= Integer.parseInt(equationList[1]);
            start = 2;
        } else {
            sum += Integer.parseInt(equationList[0]);
            start = 1;
        }
        for(int i = start; i<equationList.length-1; i+=2) {
            String sign = equationList[i];
            int minusSign = 0;
            for (int j = 0; j < sign.length(); j++) {
                Character charSign = sign.charAt(j);
                if (charSign.toString().equals("-")) {
                    minusSign += 1;
                }
            }
            if (minusSign % 2 == 0) {
                sum += Integer.parseInt(equationList[i + 1]);
            } else {
                sum -= Integer.parseInt(equationList[i + 1]);
            }
        }
        return sum;
    }
}
