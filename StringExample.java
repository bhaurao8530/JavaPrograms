
public class StringExample {
    public static void main(String[] args) {

        String firstName = "Bhaurao";
        String lastName = "Jadhav";

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        int length = firstName.length();
        System.out.println("Length of Full Name:" + length);

        String UpperCaseName = fullName.toUpperCase();
        System.out.println("UpperCaseName for FullName:" + UpperCaseName);

        String reversedString = new StringBuilder(fullName).reverse().toString();
        System.out.println("Reversed String :" + reversedString);
    }
}
