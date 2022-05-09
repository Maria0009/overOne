package lessons.lesson_27.homeWork.point_2;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBase {
    private String login;
    private String password;

    public int isCorrectLogin() {
        if (login.length() < 5 && login.length() > 15) {
            return 0;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()) {
            return -1;
        } else {
            return 1;
        }
    }

    private int isCorrectPassword() {
        if (password.length() < 5 || password.length() > 12) {
            return 0;
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            return -1;
        }
        return 1;
    }


}

