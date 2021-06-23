import metier.IMetierImpl;
import metier.IMetierProxy;
import presantation.Presantation;

public class Main {

    public static void main(String[] args) {
        Presantation presantation=new Presantation(new IMetierProxy());
        presantation.afficherPow2(3);
        presantation.afficherPow2(9);
        presantation.afficherPow2(9);
        presantation.afficherPow2(12);

    }
}
