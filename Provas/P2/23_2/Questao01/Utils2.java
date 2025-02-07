import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Utils2 {
  public static void imprimirCustos(List<Carro> lista) {
    double totalPreco = 0.0, totalImposto = 0.0;

    for (Carro c : lista) {
      for (Acessorio a : c.getAcessorios()) {
        totalPreco += a.getPreco();
        totalImposto += a.calcularImposto();
      }
    }

    System.out.println(totalPreco);
    System.out.println(totalImposto);
  }

  public static Map<String, Carro> transformaListaEmMapa(List<Carro> carros) {
    Iterator<Carro> i = carros.iterator();
    Map<String, Carro> m = new HashMap<String, Carro>();

    while (i.hasNext()) {
      Carro c = i.next();
      m.put(c.getPlaca(), c);
    }

    return m;
  }
}