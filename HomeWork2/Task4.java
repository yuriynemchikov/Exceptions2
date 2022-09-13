import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String something = getString();
        System.out.println(something);
    }

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        while(str.isEmpty()){
            System.out.println("input something");
            str = scanner.nextLine();
        }
        return str;
    }
}
