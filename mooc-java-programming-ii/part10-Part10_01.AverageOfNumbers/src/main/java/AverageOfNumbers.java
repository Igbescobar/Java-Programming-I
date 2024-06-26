
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> allInputs = new ArrayList<>();

    while (true) {
      String userInput = scanner.nextLine();
      if (userInput.equals("end")) {
        break;
      }
      allInputs.add(userInput);
    }

    double average = allInputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();

    System.out.println("average of the numbers: " + average);
  }
}
