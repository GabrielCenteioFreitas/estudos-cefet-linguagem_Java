import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils {
  public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
    return x.contains(y);
  }

  public static void ordena(List<CorpoCeleste> x) {
    x.sort((c1, c2) -> Double.compare(c1.getDistancia(), c2.getDistancia()));
  }

  public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException {
    Map<String, CorpoCeleste> m = new HashMap<String, CorpoCeleste>();
    Iterator<String> i = conjuntoCorpos.iterator();

    while (i.hasNext()) {
      String s = i.next();
      String[] partes = s.split("#");
      CorpoCeleste c;

      if (partes.length != 4) {
        throw new FormatoIncorretoException(s);
      }

      if (partes[3].equals("P")) {
        c = new Planeta(partes[0]);
      } else if (partes[3].equals("E")) {
        c = new Estrela(partes[0]);
      } else {
        c = new CorpoCeleste(partes[0]);
      }

      c.setNome(partes[1]);
      c.setDistancia(Double.parseDouble(partes[2]));

      m.put(partes[0], c);
    }

    return m;
  }
}