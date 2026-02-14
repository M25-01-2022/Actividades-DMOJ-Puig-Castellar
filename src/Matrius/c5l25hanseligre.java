package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class c5l25hanseligre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String espacio = sc.nextLine();

        if (n != 5){
            char[][] tablero = new char[n][n + 2];
            for (int i = 0; i < n; i++){
                String linea = sc.nextLine();
                for (int j = 0; j < n + 2; j++){
                    tablero[i][j] = linea.charAt(j);
                }
            }

            boolean perdido = true;
            while (perdido){
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n + 2; j++){
                        System.out.print(tablero[i][j]);
                    }
                    System.out.println();
                }
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n + 2; j++){
                        if (tablero[i][j] == 'H' && tablero[i][j - 1] == '.'){
                            tablero[i][j - 1] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i - 1][j] == '.'){
                            tablero[i - 1][j] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i][j + 1] == '.'){
                            tablero[i][j + 1] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i + 1][j] == '.'){
                            tablero[i + 1][j] = 'H';
                            tablero[i][j] = ' ';
                            for (int k = 0; k < n; k++){
                                for (int l = 0; l < n + 2; l++){
                                    System.out.print(tablero[k][l]);
                                }
                                System.out.println();
                            }
                            break;
                        }
                        if (tablero[i][j] == 'H' && tablero[i][j - 1] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i - 1][j] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i][j + 1] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i + 1][j] == 'A'){
                            perdido = false;
                        }
                        if (!perdido) return;
                    }
                }
            }
        } else if (n == 5){
            char[][] tablero = new char[n][n + 1];
            for (int i = 0; i < n; i++){
                String linea = sc.nextLine();
                for (int j = 0; j < n + 1; j++){
                    tablero[i][j] = linea.charAt(j);
                }
            }
            boolean perdido = true;
            while (perdido){
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n + 1; j++){
                        System.out.print(tablero[i][j]);
                    }
                    System.out.println();
                }
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n + 1; j++){
                        if (tablero[i][j] == 'H' && tablero[i][j + 1] == '.'){
                            tablero[i][j + 1] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i - 1][j] == '.'){
                            tablero[i - 1][j] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i][j - 1] == '.'){
                            tablero[i][j - 1] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        } else if (tablero[i][j] == 'H' && tablero[i + 1][j] == '.'){
                            tablero[i + 1][j] = 'H';
                            tablero[i][j] = ' ';
                            break;
                        }
                        if (tablero[i][j] == 'H' && tablero[i][j - 1] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i - 1][j] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i][j + 1] == 'A'){
                            perdido = false;
                        } else if (tablero[i][j] == 'H' && tablero[i + 1][j] == 'A'){
                            perdido = false;
                        }
                        if (!perdido) return;
                    }
                }
            }
        }
    }
}