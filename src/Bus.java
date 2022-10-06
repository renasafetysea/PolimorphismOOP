
public class Bus extends Car implements Competitor{



    public Bus(String brand, String model, int maxSpeed, Float engineVolume) {

        super(brand, model,maxSpeed, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился!");
    }


    @Override
    public void pitStop() {
        System.out.println("Здесь был пит стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автобуса - " + getModel());

    }

    @Override
    public void maxSpeedIs() {
        System.out.println("Максимальная скорость - " + getMaxSpeed());

    }


}
