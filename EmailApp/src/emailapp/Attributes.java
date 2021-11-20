package emailapp;

import java.util.Locale;

public class Attributes {
    private String firstName;
    private String lastName;
    private String department;
    private String username;
    private String password;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String Username() {
        username = firstName.charAt(0) + lastName;
        return username;
    }

    public String Email() {
        return username + "@deviate.com";
    }

    public String Password() {

        String digits = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = lowercaseLetters.toUpperCase(Locale.ROOT);
        String specialCharacters = " !#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\"";
        String possibleChar = digits + lowercaseLetters + uppercaseLetters + specialCharacters;

        StringBuilder passwordBuilder = new StringBuilder();

        for (int index = 0; index < 2; index++) {

            char randDigit = digits.charAt((int) (Math.random() * (digits.length()-1) ));
            char randLowercase = lowercaseLetters.charAt((int) (Math.random() * (lowercaseLetters.length()-1) ));
            char randUppercase = uppercaseLetters.charAt((int) (Math.random() * (uppercaseLetters.length()-1) ));
            char randSpecial = specialCharacters.charAt((int) (Math.random() * (specialCharacters.length()-1) ));

            passwordBuilder.append(randDigit);
            passwordBuilder.append(randLowercase);
            passwordBuilder.append(randSpecial);
            passwordBuilder.append(randUppercase);
        }

        password = passwordBuilder.toString();

        return password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
