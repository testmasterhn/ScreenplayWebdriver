package common;

public class Validators {

    /*
       - Validate the email inputted.
     */
    public boolean isEmail(String email)
    {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    /*
        - Check the value is contain both Number and Character
     */
    public boolean isAlphaNumber(String value)
    {
        String regex = "[a-zA-Z0-9]+";
        return value.matches(regex);
    }

    /*
        - Check the value is not contain Unicode Charater
     */
    public boolean isNonUnicodeString(String strValue)
    {
        String regex = "[a-zA-Z]+";
        return strValue.matches(regex);
    }

    /*
        - Check the value is number or not
     */
    public boolean isNumber(String number)
    {
        String regex = "[0-9]+";
        return number.matches(regex);
    }
}
