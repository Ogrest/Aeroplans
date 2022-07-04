import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private List<Aeroplans> aeroplansList;

    public Aeroport() {
        aeroplansList = new ArrayList<>();
    }

    void addAeroplan(Aeroplans x){
        aeroplansList.add(x);
    }

    void delAeroplan(Aeroplans x){
        aeroplansList.remove(x);
    }

    public List<Aeroplans> getAeroplansList() {
        return aeroplansList;
    }
}
