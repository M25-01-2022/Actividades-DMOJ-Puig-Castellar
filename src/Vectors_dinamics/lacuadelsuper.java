package Vectors_dinamics;

import java.util.*;
public class lacuadelsuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int tempstotal = 0;
        int tempsDesdeAfegitCua= 0;
        ArrayList<String> cua = new ArrayList<>();
        while(true){
            String item = sc.next();
            if(item.equals("|")){
                tempstotal++;
                tempsDesdeAfegitCua++;
            } else{
                cua.add(item);
                tempsDesdeAfegitCua = 0;
            }
            if(!cua.isEmpty() && tempstotal > 0 && tempstotal % 2 == 0){
                cua.removeFirst();
            }
            if(cua.isEmpty() && tempsDesdeAfegitCua > 5){
                System.out.println(tempstotal);
                return;
            }
        }
    }
}