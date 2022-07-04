public class Su72 implements AerplansExtra{

    private int maxPassenger = 2;
    private int passenger;

    public Su72() {
    }

    @Override
    public void addPassenger(int passenger){
            if (passenger <= maxPassenger){
                this.passenger = passenger;
                System.out.println("Люди загружены в самолёт!");
            } else {
                System.out.println("Люди не помещаются в самолёт!");
            }
    }

    @Override
    public void takeoff() {
        System.out.println("Истребитель вылетел к цели!");
    }

    @Override
    public void landing() {
        System.out.println("Истребитель заходит на посадку!");
    }
    public void extraSkill(){
        System.out.println("Выпустить все ракеты в цель!");
    }
}
