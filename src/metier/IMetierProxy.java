package metier;

import java.util.HashMap;
import java.util.Map;

public class IMetierProxy implements IMetier {
    IMetierImpl metier=new IMetierImpl();
    Map<Integer,Double> cashMemory=new HashMap<>();

    @Override
    public double pow2(int x) {
        Double res=cashMemory.get(x);
        if (res!=null) {
            System.out.println("result From cashMemory");
        }
        else {
            res = metier.pow2(x);
            System.out.println("result From new calcul");
            cashMemory.put(x, res);
        }
        return res;
    }
}
