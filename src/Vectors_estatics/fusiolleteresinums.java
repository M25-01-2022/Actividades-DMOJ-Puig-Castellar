package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class fusiolleteresinums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        char[] num1 = new char[n];
        for (int i = 0; i < n; i++) {
            num1[i] = sc.next().charAt(0);
        }
        int m = sc.nextInt();
        char[] num2 = new char[m];
        for(int i = 0; i < m; i++){
            num2[i] = sc.next().charAt(0);
        }

        if (n < m || n == m){
            for (int i = 0; i < m; i++) {
                try{
                    if (Character.isDigit(num1[i])) {
                        System.out.print(num1[i] + " ");
                    } else if (Character.isDigit(num2[i])) {
                        System.out.print(num2[i] + " ");
                    }
                    if (Character.isLetter(num1[i])) {
                        System.out.print(num1[i] + " ");
                    } else if (Character.isLetter(num2[i])) {
                        System.out.print(num2[i] + " ");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (Character.isLetter(num2[m - 1])){
                        if (Character.isDigit(num2[i])) {
                            System.out.print(num2[i] + " ");
                        } else if (Character.isLetter(num2[i])) {
                            System.out.print(num2[i] + " ");
                        }
                    } else if (Character.isDigit(num2[m - 1])) {
                        System.out.print(num2[m - 1] + " ");
                        if (Character.isDigit(num2[i])) {
                            System.out.print(num2[i] + " ");
                            break;
                        }
                        if (Character.isLetter(num2[i])) {
                            System.out.print(num2[i] + " ");
                            break;
                        }
                    }
                }
            }
        } else if (n > m){
            for (int i = 0; i < n; i++) {
                try{
                    if (Character.isDigit(num1[i])) {
                        System.out.print(num1[i] + " ");
                    }
                    if (Character.isDigit(num2[i])) {
                        System.out.print(num2[i] + " ");
                    }
                    if (Character.isLetter(num1[i])) {
                        System.out.print(num1[i] + " ");
                    } else if (Character.isLetter(num2[i])) {
                        System.out.print(num2[i] + " ");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (Character.isDigit(num2[m - 1])){
                       return;
                    } else if (Character.isLetter(num2[m - 1])) {
                        System.out.print(num2[i - 1]+ " ");
                        if (Character.isDigit(num1[i])) {
                            System.out.print(num1[i] + " ");
                            break;
                        } else if (Character.isLetter(num1[i])) {
                            System.out.print(num1[i] + " ");
                            break;
                        }
                    }
                }
            }
        }
    }
}