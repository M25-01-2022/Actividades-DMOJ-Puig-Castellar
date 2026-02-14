package Program_Orient_Obj;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class bf6f0functiongame2 {
    Scanner sc = new Scanner(System.in);
    public boolean function1 (int r) {
        return 2 == r || 10 == r;
    }

    public boolean function2 (float r) {
        return 0.0f <= r;
    }

    public String function3(int num, String text) {
        return text.repeat(num);
    }

    public int function4(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        return sum;
    }

    public int[] function5(int[] n) {
        int[] res = new int[n.length];
        for (int i = 0; i < n.length; i++){
            res[i] = n[i] * 2;
        }
        return res;
    }

    //falta
    public String[] function6(int n, boolean m) {
        String p = m ? "cierto" : "falso";
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = p;
        }
        return res;
    }

    public int function7(String[] n) {
        int total = 0;
        for (String s : n) {
            if(s.equals("java")){
                total += 1;
            }
        }
        return total;
    }

    public int[] function8(int a, int b, int c) {
        int[] res = {a, b, c};
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        bf6f0functiongame2 fg2 = new bf6f0functiongame2();

        String functionName = scanner.next();

        switch (functionName) {
            case "function1":
                for (int i = 5; i-- > 0; ) {
                    int param = scanner.nextInt();
                    boolean returnValue = fg2.function1(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function2":
                for (int i = 6; i-- > 0; ) {
                    float param = scanner.nextFloat();
                    boolean returnValue = fg2.function2(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function3":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    String param2 = scanner.next();
                    String returnValue = fg2.function3(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + returnValue);
                }
                break;
            case "function4":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int returnValue = fg2.function4(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function5":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int[] returnValue = fg2.function5(param);
                    System.out.println(Arrays.toString(param) + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function6":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    boolean param2 = scanner.nextBoolean();
                    String[] returnValue = fg2.function6(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function7":
                for (int i = 5; i-- > 0; ) {
                    int size = scanner.nextInt();
                    String[] param = new String[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.next();
                    }
                    int returnValue = fg2.function7(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function8":
                for (int i = 9; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    int param2 = scanner.nextInt();
                    int param3 = scanner.nextInt();
                    int[] returnValue = fg2.function8(param1, param2, param3);
                    System.out.println(param1 + "," + param2 + "," + param3 + " -> " + Arrays.toString(returnValue));
                }
                break;
        }
    }
}
