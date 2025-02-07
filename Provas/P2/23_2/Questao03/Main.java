import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Digite uma frase: ");
    String str = s.nextLine();

    try {
      Utils.verifica(str);
      String textoModerado = Utils.moderar(str);
      System.out.println("Texto moderado: " + textoModerado);
    } catch (TextoCurtoException e) {
      System.out.println(e.getMessage());
    }

    s.close();
  }
}