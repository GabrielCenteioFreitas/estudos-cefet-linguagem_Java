import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Insira uma frase: ");
    String frase = s.nextLine();
    System.out.println(Utils.moderar(frase));
    s.close();
  }
}