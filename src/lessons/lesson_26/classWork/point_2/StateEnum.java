package lessons.lesson_26.classWork.point_2;

public enum StateEnum {
    BAK("USD"),
    RUSSIAN_RUBLE("RUB"),
    EURO("EUR");

    String currency;

    StateEnum(String currency) {
        this.currency = currency;
    }

}
