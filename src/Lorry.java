public class Lorry extends  Car implements Competitor{


    private Weight weight;

    public Lorry(String brand, String model, int maxSpeed, Float engineVolume, Weight weight) {
        super(brand, model, maxSpeed, engineVolume);
        this.weight = weight;
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

    @Override
    public void printInfo() {
        if (weight == null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Грузоподьемность -  " + weight.getStringWeight());
        }

    }

    public Weight getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ГрузоподЪемность - " + getModel() + weight;
    }
}







