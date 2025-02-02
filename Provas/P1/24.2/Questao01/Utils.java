import java.util.ArrayList;

public class Utils {
  public static boolean moderar(String frase) {
    ArrayList<String> palavroes = Utilidades.getPalavroes();
    String[] palavras = frase.toLowerCase().split(" ");
    for (String palavra : palavras) {
      if (palavroes.contains(palavra)) {
        return true;
      }
    }

    return false;
  }
}
