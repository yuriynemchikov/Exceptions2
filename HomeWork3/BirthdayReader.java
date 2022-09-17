import java.util.Scanner;

public class BirthdayReader {

    private String birthday = null;

    public String getBirthday() throws InvalidDateException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the date in the format dd-mm-yyyy: ");
        String birthday = scanner.nextLine();
        if(!isValid(birthday)){
            throw new InvalidDateException(birthday);
        }
        return birthday;
    }

    public static boolean isValid(String str){
        return str.matches("^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)$");
    }

}
