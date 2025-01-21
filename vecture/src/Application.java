import java.util.*;

public class Application {
    private ArrayList<Vecture> list;
    public Application() {
        list = new ArrayList<>();
    }

    public void afficher(){
        Collections.sort(list);// ehy i have an error here?
        Vecture vecture = new Vecture(3,0);
        for(Vecture i : list){
            if(i.tail() ==  vecture.tail()) System.out.println(i);
            else if(i.tail() > vecture.tail()) break;
        }
    }


}

