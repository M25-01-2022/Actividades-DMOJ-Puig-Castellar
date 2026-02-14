package Program_Orient_Obj;

import java.util.Scanner;


class Casella {
    char lletra;

    Casella(char lletra){
        this.lletra = lletra;
    }
}

class Columna {
    Casella casella;

    Columna(char lletra){
        this.casella = new Casella(lletra);
    }
}

class Fila {
    Columna[] columnes;

    Fila(int nColumnes, char lletra){
        columnes = new Columna[nColumnes];
        for(int i = 0; i < nColumnes; i++){
            columnes[i] = new Columna(lletra);
        }
    }
}

class Taula {
    Fila[] files;

    Taula(int nFiles, int nColumnes, char lletra){
        files = new Fila[nFiles];
        for(int i = 0; i < nFiles; i++){
            files[i] = new Fila(nColumnes, lletra);
        }
    }
}
public class f831btablaclassl0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Taula taula = new Taula(scanner.nextInt(), scanner.nextInt(), scanner.next().charAt(0));

        for (int i = 0; i < taula.files.length; i++) {
            for (int j = 0; j < taula.files[i].columnes.length; j++) {
                System.out.print(taula.files[i].columnes[j].casella.lletra);
            }
            System.out.println();
        }
    }
}