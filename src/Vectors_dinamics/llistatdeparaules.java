package Vectors_dinamics;

import java.util.*;
public class llistatdeparaules {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<String> paraules = new ArrayList<>();
        while(true){
            String p = sc.next();
            if(p.equals("END"))break;
            else paraules.add(p);
        }
        Object[] array = paraules.toArray();
        Arrays.sort(array);
        for(Object o : array){
            System.out.println(o);
        }
    }
}