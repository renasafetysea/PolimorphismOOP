public enum Weight {
        N_1(" с полной массой до 3,5 тонн"),
        N_2(" с полной массой свыше 3,5 до 12 тонн"),
        N_3("с полной массой свыше 12 тонн");

        private final String stringWeight;

        Weight(String stringWeight) {
            if (stringWeight == null || stringWeight.isBlank()) {
                this.stringWeight = "Данные не указаны! ";
            } else {
                this.stringWeight = stringWeight;

            }
        }

        public String getStringWeight() {
            return stringWeight;
        }
}
