public class Boing implements AerplansExtra{

    private int maxPassenger = 747;
    private int passenger;

    public Boing() {
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
        System.out.println("Рейс вылетел в сторону пункта назначения!");
    }

    @Override
    public void landing() {
        System.out.println("Рейс заходит на посадку!");
    }

    public void extraSkill(){
        System.out.println("Экстренный сброс пассажиров выполнен!");
    }

}
