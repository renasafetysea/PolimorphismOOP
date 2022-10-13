public enum Capacity {
        VERY_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25 мест)"),
        MEDIUM("средняя (40–50 мест)"),
        LARGE("большая (60-80 мест)"),
        VERY_LARGE(" очень большая (100-120 мест)");


        private final String stringCapacity;

        Capacity(String stringCapacity) {
            if (stringCapacity == null || stringCapacity.isBlank()) {
                this.stringCapacity = "Данные не указаны! ";
            } else {
            this.stringCapacity = stringCapacity;
        }
        }

        public String getStringCapacity() {
            return stringCapacity;
        }

    }
