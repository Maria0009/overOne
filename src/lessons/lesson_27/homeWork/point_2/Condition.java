package lessons.lesson_27.homeWork.point_2;

public enum Condition {
    INCORRECT_LOGIN_LENGTH("Incorrect login length"),
    INCORRECT_PASSWORD_LENGTH("Incorrect password length"),
    INCORRECT_LOGIN("Incorrect login"),
    INCORRECT_PASSWORD("Incorrect password");

    private String description;

    Condition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
