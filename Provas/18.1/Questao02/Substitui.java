import java.util.Scanner;

public class Substitui {
  public static String processa(String str) {
    String invertido = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      invertido += str.charAt(i);
    }
    return invertido.toUpperCase().replace("A", "4").replace("E", "3").replace("I", "1").replace("O", "0");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String inputProcessado = processa(input);
    System.out.println(inputProcessado);
    scanner.close();
  }
}