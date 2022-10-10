
   public class Transport  {
        private final String brand;
        private final String model;

        private final int maxSpeed;


        public Transport(String brand, String model, int maxSpeed) {
            if (brand == null || brand.isBlank()) {
                this.brand = "brand";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isBlank()) {
                this.model = "model";
            } else {
                this.model = model;
            }
            this.maxSpeed = maxSpeed;
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

        @Override
        public String toString() {
            return "Бренд - " + brand + ". Модель - " + model + ". Максимальная скорость - " + maxSpeed;
        }
    }
