import java.util.List;

public class Utils {
  public static boolean existe(List<?> lista, Planta planta) {
    return lista.contains(planta);
  }

  public static Planta[] ordena(List<Planta> lista) {
    Planta[] plantas = lista.toArray(new Planta[0]);
    Planta aux;

    for (int i = 0; i < lista.size() - 1; i++) {
      for (int j = i + 1; j < lista.size(); j++) {
        if (plantas[i].getTamanho() > plantas[j].getTamanho()) {
          aux = plantas[i];
          plantas[i] = plantas[j];
          plantas[j] = aux;
        }
      }
    }

    return plantas;
  }
}
