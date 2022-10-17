public class Bus extends Car implements Competitor {
    private Capacity capacity;

    public Bus(String brand, String model, int maxSpeed, Float engineVolume, Capacity capacity) {
        super(brand, model, maxSpeed, engineVolume);
        setCapacity(capacity);
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    @Override
    public String toString() {
        return "Вместимость автобуса - " + getModel() + capacity;
    }

    @Override
    public void printInfo() {
        if (capacity == null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Вместимость " + capacity.getStringCapacity());
        }

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {
        System.out.println("Автобус - " + getBrand() + getModel() + " в диагностике не требуется");
        return true;
    }
}


