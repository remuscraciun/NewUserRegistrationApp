package emailapp;

public class Main {

    public static void main(String[] args) {
        //EmailDataFormGUI frame = new EmailDataFormGUI("New User");
        Attributes user = new Attributes();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setDepartment("Sales");
        System.out.println(user.Username());
        System.out.println(user.Email());
        System.out.println(user.Password());
    }
}
