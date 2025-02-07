import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cod = s.nextLine();
    Pais paisProcurado = new Pais(cod);
    
    List<Pais> l = CriaPaises.retornaPaises();

    if (l.contains(paisProcurado)) {
      Pais p = l.get(l.indexOf(paisProcurado));
      System.out.println(p.getNome() + " - " + p.getDensidade() + " - " + p.getFronteiricos());
    } else {
      System.out.println("Pais nao encontrado");
    }

    s.close();
  }
}