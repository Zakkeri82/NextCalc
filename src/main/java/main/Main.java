package main;

import nextCalc.NextCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите арифметическое действие с целыми числами");
        System.out.println("Например: 2 + 3");

        boolean number = true;
        String str = null;
        while (number) {
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert str != null;
            if (str.contains(".")) {
                System.out.println("Введена неправельная строка. Попробуйте снова");
                number = true;
            } else {
                number = false;
            }
        }
        String[] action = str.trim().split(" ");
        try {

            int a = Integer.parseInt(action[0]);
            int b = Integer.parseInt(action[2]);

            if ("+".equals(action[1])) {
                System.out.println(NextCalc.addition(a, b));
            } else if ("-".equals(action[1])) {
                System.out.println(NextCalc.subtraction(a, b));
            } else if ("*".equals(action[1])) {
                System.out.println(NextCalc.multiplication(a, b));
            } else if ("/".equals(action[1])) {
                System.out.println(NextCalc.division(a,b));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Введена неправельная строка.");
        }
    }
}
