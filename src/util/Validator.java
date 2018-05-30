package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java validation program
 * @author pankaj
 */
public class Validator {
    /**
     * This method validates the input email address with email_regex pattern
     * 
     * @param email
     * @return boolean
     */
    public static boolean validateEmail(String email) {
            String email_regex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            Pattern pattern = Pattern.compile(email_regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
    }

    /**
     * This method validates the input name with name_regex pattern
     * 
     * @param name
     * @return boolean
     */
    public static boolean validateName(String name) {
        String name_regex = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(name_regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    /**
     * This method validates the input date
     * 
     * @param date
     * @return boolean
     */
    public static boolean validateDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
          dateFormat.parse(date);
        } catch (ParseException pe) {
          return false;
        }
        return true;
    }
}