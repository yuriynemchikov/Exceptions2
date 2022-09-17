import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameReader {
    private List<String> name = new ArrayList<>();

    public List<String> getName() throws NoFullNameException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your full name: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.split(" ");;
        if(words.length == 2 || words.length == 3){
            for(int i = 0; i < words.length; i++){
                if(isWord(words[i])) {
                    name.add(words[i]);
                }
                else{
                    throw new IncorrectDataInNameException(words[i]);
                }
            }
        } else{
            throw new NoFullNameException(words);
        }
        scanner.close();
        return name;
    }

    public static boolean isWord(String str){
        return str.matches("^[A-Za-z]+$");
    }
}
