import java.util.Scanner;

public class SomaEMedia {
  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);

    System.out.print("Digite números separados por espaços: ");
    String input = inputReader.nextLine();
    
    String inputParts[] = input.split(" ");

    float sum = 0;
    int quantity = 0;
    for (int i = 0; i < inputParts.length; i++) {
      try {
        float number = Float.parseFloat(inputParts[i]);
        sum += number;
        quantity++;
      } catch (Exception error) {}
    }

    System.out.println("Soma: " + sum);
    System.out.println("Média: " + sum / quantity);

    inputReader.close();
  }
}
