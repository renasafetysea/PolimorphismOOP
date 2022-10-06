public class PassengerCar extends Car implements Competitor {

        public PassengerCar(String brand, String model,int maxSpeed, Float engineVolume) {
        super(brand, model, maxSpeed, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Пассажирская машина - " + getModel() + " начала движение!");
    }

    @Override
    public void stop() {
        System.out.println("Пассажирская машина - " + getModel() + " остановилась!");
    }

    @Override
    public void pitStop() {
        System.out.println("Здесь был пит стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у пассажирской машины " + getModel());

    }

    @Override
    public void maxSpeedIs() {
        System.out.println("Максимальная скорость - " + getMaxSpeed());

    }

}

