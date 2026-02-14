package Program_Orient_Obj;

class CompteCorrent{
    public float saldo;
    public String nomPropietari;
    public boolean bloquejada;
}
public class definirlaclasseco {
    public static void main(String[] args) {
        CompteCorrent cc = new CompteCorrent();

        cc.saldo = 999.9f;
        cc.nomPropietari = "Jeff Bezos";
        cc.bloquejada = false;

        System.out.println(cc.saldo);
        System.out.println(cc.nomPropietari);
        System.out.println(cc.bloquejada);
    }
}