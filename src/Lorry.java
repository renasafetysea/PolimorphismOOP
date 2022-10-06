public class Lorry extends  Car implements Competitor{

        public Lorry(String brand, String model,int maxSpeed, Float engineVolume) {
        super(brand, model, maxSpeed, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик - " + getModel() + " начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик - " + getModel() + " остановился!");
    }

    @Override
    public void pitStop() {
        System.out.println("Здесь был пит стоп!");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у грузовика - " + getModel());

    }

    @Override
    public void maxSpeedIs() {
        System.out.println("Максимальная скорость - " + getMaxSpeed());

    }


}



