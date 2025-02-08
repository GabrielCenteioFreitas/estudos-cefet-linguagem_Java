import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utils {
  public Map<String, CriaturaMarinha> retornaDados(Set<String> conjuntoCriaturas) throws FormatoIncorretoException {
    Map<String, CriaturaMarinha> m = new HashMap<String, CriaturaMarinha>();

    for (String s : conjuntoCriaturas) {
      String[] partes = s.split("#");

      if (partes.length != 3) {
        throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String [" + s + "] está incorreto.");
      }

      CriaturaMarinha c = new CriaturaMarinha(partes[0], partes[1], Integer.parseInt(partes[2]));
      m.put(partes[0], c);
    }

    return m;
  }
}
