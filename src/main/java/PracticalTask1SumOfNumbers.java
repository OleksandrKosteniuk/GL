import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticalTask1SumOfNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src\\main\\resources\\number.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        double sum = 0;

        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            if (isDigit(string)) {
                sum = sum + Double.parseDouble(string);
            }
        }
        System.out.println(sum);
    }

    private static boolean isDigit(String string) throws NumberFormatException {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}