import java.util.*;

public class Application {
    private ArrayList<Vecture> list;
    public Application() {
        list = new ArrayList<>();
    }

    public void afficher(){
        Collections.sort(list);
        Vecture vecture = new Vecture(3,0);
        for(Vecture i : list){
            if(i.tail() ==  vecture.tail()) System.out.println(i);
            else if(i.tail() > vecture.tail()) break;
        }
    }

    double[] tabProd(Vecture[] V1, Vecture[] V2) {
        if (V1.length != V2.length) throw new IllegalArgumentException("Vector arrays must have the same size.");
        double[] V3 = new double[V1.length];
        for (int i = 0; i < V1.length; i++) {
            try {
                V3[i] = V1[i].prodScal(V2[i]);
            } catch (Exception ex) {
                System.out.println("Impossible to calculate scalar product: " + ex.getMessage());
            }
        }
        return V3;
    }

}

