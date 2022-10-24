import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class parcingDB {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/inputVal.txt");

        Scanner sc = new Scanner(input);

        List<String> inputVal = new ArrayList<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (Pattern.matches("[a-z]+", s)) {
                inputVal.add(s);
                sc.nextLine();
                inputVal.add(sc.nextLine());
            }
        }

        for (int i = 0; i < inputVal.size(); i = i + 2) {
            System.out.println(inputVal.get(i).toUpperCase() + "(\"" + inputVal.get(i + 1).toLowerCase() + "\"),");
        }
    }
}