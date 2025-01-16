import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    ArrayList<String> linhas = LerArquivo.retornaStrings("c:/plantas.txt");
    ArrayList<Planta> plantas = Utils.retornaDados(linhas);
    Planta planta = new Planta(id);
    if (Utils.existe(plantas, planta)) {
      for (Planta p : plantas) {
        if (p.equals(planta)) {
          System.out.println(p);
        }
      }
    } else {
      System.out.println("A planta com ID " + id + " não existe."); 
    }
    scanner.close();
  }
}