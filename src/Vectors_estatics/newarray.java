package Vectors_estatics;

import java.util.*;
public class newarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float[] arrayFloats = new float[100];
        arrayFloats[0] = 31.0f;
        arrayFloats[1] = 56.0f;
        arrayFloats[19] = 12.0f;
        arrayFloats[99] = 79.0f;
        for (float arrayFloat : arrayFloats) {
            System.out.print(arrayFloat + " ");
        }
    }
}