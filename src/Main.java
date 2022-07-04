import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aeroport aeroport = new Aeroport();

        aeroport.addAeroplan(new Su72());
        aeroport.addAeroplan(new Boing());
        aeroport.addAeroplan(new СornPlane());

        List<Aeroplans> planList = aeroport.getAeroplansList();
        ((AerplansExtra)planList.get(1)).extraSkill();
        ((AerplansExtra)planList.get(0)).extraSkill();
        ((AerplansExtra)planList.get(2)).extraSkill();
    }
}