package Program_Orient_Obj;

import java.util.Scanner;

class Direccion {
    String calle;
    String codPostal;
    String ciudad;
    String provincia;
}

class Contacto {
    String nombre;
    String apellidos;
    Direccion direccion;
}

public class d1e2acontactclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contacto contacto = new Contacto();

        contacto.direccion = new Direccion();

        contacto.nombre = scanner.nextLine();
        contacto.apellidos = scanner.nextLine();
        contacto.direccion.calle = scanner.nextLine();
        contacto.direccion.codPostal = scanner.nextLine();
        contacto.direccion.ciudad = scanner.nextLine();
        contacto.direccion.provincia = scanner.nextLine();

        System.out.println(contacto.apellidos + ", " + contacto.nombre);
        System.out.println(contacto.direccion.calle);
        System.out.println(contacto.direccion.codPostal + " - " + contacto.direccion.ciudad);
        System.out.println(contacto.direccion.provincia);
    }
}