import java.util.ArrayList;
import java.util.List;

public abstract class Transport  {
        private final String brand;
        private final String model;
        private final int maxSpeed;
        private final List<Driver<?>> drivers = new ArrayList<>();
        private final List<Mechanik<?>> mechaniks = new ArrayList<>();
        private final List<Sponsor> sponsors = new ArrayList<>();




    public Transport(String brand, String model, int maxSpeed) {
            if (brand == null || brand.isBlank()) {
                this.brand = "Информация не указана";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isBlank()) {
                this.model = "Информация не указана";
            } else {
                this.model = model;
            }
            this.maxSpeed = maxSpeed;
        }
        public void addDriver(Driver<?> driver){
        drivers.add(driver);
        }
    public void addMechanik(Mechanik<?> mechanik){
        mechaniks.add(mechanik);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanik<?>> getMechaniks() {
        return mechaniks;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }
        public abstract void repair();

        public abstract void fixTransport();
    public abstract boolean diagnostics();

       @Override
        public String toString() {
            return "Бренд - " + brand + ". Модель - " + model + ". Максимальная скорость - " + maxSpeed;
        }

    public boolean service() {
           return service();
    }
}
