package presantation;

import metier.IMetier;

public class Presantation {
    public Presantation(IMetier metier) {
        this.metier = metier;
    }

    IMetier metier;

    public void setMetier(IMetier metier) {
        this.metier = metier;
    }

    public void afficherPow2(int x){
        System.out.println("------------------------------");
        System.out.println(x+" to power 2 = "+metier.pow2(x));

    }
}
