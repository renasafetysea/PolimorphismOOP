public class PassengerCar extends Car implements Competitor {

    public Tipe tipe;


    public PassengerCar(String brand, String model, int maxSpeed, Float engineVolume, Tipe tipe) {
        super(brand, model, maxSpeed, engineVolume);
        this.tipe = tipe;
    }

    public Tipe getTipe() {
        return tipe;
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

    @Override
    public void fixTransport() {

    }
    @Override
    public void repair() {
        System.out.println("Пассажирская машина  " + getBrand() + getModel() + " починена.");

    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.7;
    }

    @Override
    public void printInfo() {
        if (tipe == null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Тип кузова -  " + tipe.getStringTipe());
        }

    }


    @Override
    public String toString() {
        return "Тип кузова - " +getModel() +" - " + tipe;
    }
}