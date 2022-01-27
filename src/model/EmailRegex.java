package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

    private final String emailRegex = "^(.+)@(.+)\\.(.+)$";

    Pattern pattern = Pattern.compile(emailRegex);

}
