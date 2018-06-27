/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class Uzdevumi {

    public static void Piemeri() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        int N = 5;
        while (true) {
            if (N == 0) {
                break;
            }
            System.out.println("N = " + N);
            N--;
        }
    }
    private static Scanner input = new Scanner(System.in);

    public static void Uzdevums4() {

        System.out.print("Skaitlis = ");
        int N = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("i = " + i);
            sum += i;

        }
        System.out.println("kopeja summa = " + sum);
    }

    public static void Uzdevums5() {
        System.out.print("Skaitlu skaits = ");
        int N = input.nextInt();
        int sum = 0;
        int n = 0;

        while (true) {
            if (N == 0) {

                break;
            }
            {
                N--;
                System.out.print("Skaitlu skaitli = ");
                n = input.nextInt();
                sum += n;
            }

        }
        System.out.println("Skaitlu summa = " + sum);

    }

    public static void Uzdevums6() {
        System.out.print("Skaitlu skaits = ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            System.out.printf("%s = %s ", i, i * i * i);

        }

    }

    public static void Uzdevums7() {
        System.out.print("Simbolu skaits = ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("*");
            for (int n = i; n <= i; n++) {
                System.out.print("*");

            }
            for (int l = 1; l <= N - 1; l++) {
                System.out.print("*");

            }
        }

    }

    public static void Uzdevums8() {
        System.out.print("Simbolu skaits = ");
        int N = input.nextInt();
        for (int i = 1; i == N; i++) {
            if (i % 2 == 0) {
                    
                    for (int n = 1; n >= 1; n--) {
                        System.out.print(n);
                    }
            }else{
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
                
                }
            System.out.println();
            }
        }

    }

    public static void Uzdevums9() {
        System.out.print("skaitlis = ");
        int N = input.nextInt();
        String numberString = "" +  N;
        
        
    }
    
    public static void Uzdevums10() {
     System.out.print("Skaitlu skaits = ");
        int N = input.nextInt();
        int s = N, m;
        int k = 0;
        for (int i = 1; i <= N; i++)
        {
            m = s;
        while (s > 0)
        {
         System.out.print(" ");
         s--;
        }
        for (int j = 1; j<=i;j++)
        {
        k++;
            System.out.print(k + " ");
        }
        System.out.println();
        s = m -1;
        }
    }
}
