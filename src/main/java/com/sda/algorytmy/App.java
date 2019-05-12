package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }

        }
        System.out.println("NWD: " + a);

    }


}
