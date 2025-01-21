import java.util.*;

public class Vecture implements Comparable<Vecture>{
    private double[] coord;

    public Vecture(int n, double x){
        this.coord = new double[n];
        for(int i = 0; i < n; i++){
            this.coord[i] = x;
        }
    }

    public Vecture(double[] Table){
        coord = Table;
    }

    public int tail(){
        return coord.length;
    }

    @Override
    public String toString(){
        String S = "";
        for(int i = 0; i < coord.length; i++){
             S += coord[i] +"";
        }
        return S;
    }

    @Override
    public int compareTo(Vecture other) {
        return Integer.compare(this.tail(), other.tail());
    }

    public void affiche(){
        System.out.println(this);
    }

    public double somCor(){
        double sum = 0;
        for (int i = 0 ; i < coord.length; i++){
            sum += coord[i];
        }
        return sum;
    }

    public double prodScal(Vecture vecture) throws Exception{
        double prod = 0;
        if(coord.length == 0 || coord.length != vecture.coord.length) throw new Exception("Vectors must have the same size.");
        for (int i = 0; i < coord.length; i++){
            for (int j = 0; j < vecture.coord.length; j++){
                prod += vecture.coord[j]*coord[i];
            }
        }
        return prod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same instance
        if (!(o instanceof Vecture)) return false; // Not the same type
        Vecture other = (Vecture) o;
        return Arrays.equals(this.coord, other.coord);
    }


}