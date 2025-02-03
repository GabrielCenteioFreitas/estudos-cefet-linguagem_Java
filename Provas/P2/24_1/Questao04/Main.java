import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Insira uma String que contenha números separados pelo caractere '#': ");
    String str = s.nextLine();
    double media;

    try {
      media = MeuNumero.media(str);
      System.out.println("A média é " + media);
    } catch (NumeroNegativoException e) {
      System.out.println("O número " + e.getMessage() + " é negativo, insira apenas números positivos");
    }

    s.close();
  }
}
