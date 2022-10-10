

    public class Driver <D extends Car & Competitor> {
        private String name;
        private Integer experience;
        private char lisenseDriver;


        public Driver(String name, Integer experience, char lisenseDriver) {
            this.name = name;
            this.experience = experience;
            this.lisenseDriver = lisenseDriver;
        }


        public void start(D car) {
            System.out.println("Водитель  " + getName() + " начал движение на   " + car.getModel());
        }

        public void stop(D car) {
            System.out.println("Водитель " + getName() + " остановился на  " + car.getModel());
        }

        public void refuel(D car) {
            System.out.println("Водитель " + getName() + " заправил  " + car.getModel());

        }
        public void competition(D car){
            System.out.println("Водитель " + getName() + " управляет машиной " + car.getModel()
                    + " и будет участвовать в заезде ");

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public Integer getExperience() {
            return experience;
        }

        public void setExperience(Integer experience) {
            this.experience = experience;
        }

        public char getLisenseDriver() {
            return lisenseDriver;
        }

        public void setLisenseDriver(char lisenseDriver) {

            this.lisenseDriver = lisenseDriver;
        }

        @Override
        public String toString() {
            return "Водитель " + name +
                    ". Управляет мешиной - " + experience +
                    " лет. И права категории - " + lisenseDriver;
        }
    }

