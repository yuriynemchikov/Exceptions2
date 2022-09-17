import java.util.Scanner;

public class PhoneReader {

    public String getPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number: ");

        String number = scanner.nextLine();
        String regex = "^\\+?[0-9\\-\\s]*$";

        while(number.length() == 0){
            System.err.println("Input your number");
            number = scanner.nextLine();
        }

        if(number.matches(regex)){
            return number;
        }
        throw new RuntimeException("Number is incorrect");
    }
}
