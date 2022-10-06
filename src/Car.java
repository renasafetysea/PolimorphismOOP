
    public class Car extends Transport {
        private Float engineVolume;

        public Car(String brand, String model,int maxSpeed, Float engineVolume ) {
            super(brand, model, maxSpeed);
            setEngineVolume(engineVolume);
        }

        public Float getEngineVolume() {
            return engineVolume;
        }


        public void setEngineVolume(Float engineVolume) {
            if (engineVolume == null || engineVolume <= 0) {
                this.engineVolume = 1.5f;
            } else {
                this.engineVolume = engineVolume;
            }
        }

        public void start(){
            System.out.println(getModel() + "- Начать движение!");
        }
        public void stop(){
            System.out.println(getModel() + "- Закончить движение!");
        }


        @Override
        public String toString() {
            return super.toString() + ". Объем двигателя - " + String.format("%.1f", engineVolume);
        }


    }