import java.util.Set;

public class Utils {
  public static String moderar(String texto) {
    Set<String> palavroes = Utilidades.getPalavroes();

    for (String p : texto.split(" ")) {
      if (palavroes.contains(p.toLowerCase())) {
        String censura = "";
        for (int i = 0; i < p.length(); i++) {
          censura += "#";
        }
        texto = texto.replace(p, censura);
      }
    }

    return texto;
  }

  public static void verifica(String texto) throws TextoCurtoException {
    if (texto.length() < 10) {
      throw new TextoCurtoException(texto.length());
    }
  }
}