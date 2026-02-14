package Program_Orient_Obj;

class Gos{
    void lladrar(){
        System.out.println("Guau, guau");
    }
}
class Gat{
    void miolar(){
        System.out.println("Miau, miau");
    }
}
public class gosigat {
    public static void main(String[] args) {
        Gos gos = new Gos();
        Gat gat = new Gat();

        gos.lladrar();
        gat.miolar();
    }
}