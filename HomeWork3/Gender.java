import java.util.Scanner;

public class Gender {
    public String getGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input gender (f - female, m - male): ");

        String gender = scanner.nextLine();

        while (gender == null) {
            System.err.println("Input your gender: ");
            gender = scanner.nextLine();
        }

        if (gender == "f") {
            return "female";
        } else if (gender == "m") {
            return "male";
        }
        return gender;
    }
}
