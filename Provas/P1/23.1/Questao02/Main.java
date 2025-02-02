import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "", inputParts[];
    int i = 0;
    double somaPesos = 0, media;

    System.out.println("Formato: nome#peso#altura");
    System.out.println("Para encerrar insira 'finalizar'");
    while (!input.equals("finalizar") && i < 1000) {
      input = scanner.nextLine();
      if (input.equals("finalizar")) break;
      inputParts = input.split("#");
      somaPesos += Double.parseDouble(inputParts[1]);
      i++;
    }

    media = somaPesos / i;
  }
}