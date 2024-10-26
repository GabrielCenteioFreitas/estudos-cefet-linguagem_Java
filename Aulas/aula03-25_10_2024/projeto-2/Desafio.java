import java.util.Scanner;

public class Desafio {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String array[] = new String[3];

    int soma = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextLine();

      soma += array[i].length();
    }

    float media = (float) soma / array.length;
    System.out.println(media);

    scanner.close();
  }
}