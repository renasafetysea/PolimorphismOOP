public enum Tipe {
    SEDAN("Седан"),
    HATCH_BACK("Хетчбэк"),
    CUPE("Купэ"),
    UNIVERSAL("Универсал"),
    OFF_ROAD("Внедорожник"),
    CROSS_OVER("Кроссовер"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),
    PICK_UP("Пикап");

    private final String stringTipe;

    Tipe(String stringTipe) {
        if (stringTipe == null || stringTipe.isBlank()) {
            this.stringTipe = "Данные не указаны! ";
        } else {
            this.stringTipe = stringTipe;

}

    }
    public String getStringTipe() {
        return stringTipe;
    }
}

