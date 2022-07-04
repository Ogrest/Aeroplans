public class СornPlane implements AerplansExtra{
    private int maxPassenger = 4;
    private int passenger;

    public СornPlane() {
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
        System.out.println("Кукурузник Идёт на взлёт!");
    }

    @Override
    public void landing() {
        System.out.println("Кукурузник идёт на посадку! Бегите!");
    }

    public void extraSkill(){
        System.out.println("Попкорн приготовлен, танцы в самом разгаре");
    }
}
