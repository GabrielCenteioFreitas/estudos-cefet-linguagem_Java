import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaPrincipal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String id = s.nextLine();
    CorpoCeleste c = new CorpoCeleste(id);

    Set<String> conjunto = LerArquivo.retornaStrings("c:/corposCelestres.txt");
    try {
      Map<String, CorpoCeleste> m = Utils.retornaDados(conjunto);
      Collection<CorpoCeleste> cs = m.values();

      if (Utils.existe(cs, c)) {
        System.out.println(m.get(id));
      } else {
        System.out.println("A estrela com ID " + id + " não existe");
      }
    } catch(FormatoIncorretoException e) {
      System.out.println("Há um problema no seu arquivo texto. " + e.getMessage());
    }
  }
}