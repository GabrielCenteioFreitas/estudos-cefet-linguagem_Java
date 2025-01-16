import java.util.ArrayList;
import java.util.List;

public class Utils {
  public static boolean existe(ArrayList x, Planta y) {
    return x.contains(y);
  }

  public static Planta[] ordena(List x) {
    ArrayList<Planta> plantas = new ArrayList<Planta>();
   
    for (Object obj : x) {
      if (obj instanceof Planta) {
        Planta p = (Planta) obj;
        plantas.add(p);
      }
    }

    plantas.sort((p1, p2) -> Double.compare(p1.getTamanho(), p2.getTamanho()));

    Planta plantasArray[] = new Planta[plantas.size()];

    for (int i = 0; i < plantas.size(); i++) {
      plantasArray[i] = plantas.get(i);
    }

    return plantasArray;
  }

  public static ArrayList<Planta> retornaDados(ArrayList<String> stringsPlantas) {
    ArrayList<Planta> plantas = new ArrayList<Planta>();

    for (String stringP : stringsPlantas) {
      String[] partes = stringP.split("#");

      if(partes[3].equals("B")) {
        Briofita b = new Briofita(partes[0]);
        b.setNome(partes[1]);
        b.setTamanho(Double.parseDouble(partes[2]));
        plantas.add(b);
      } else if (partes[3].equals("P")) {
        Pteridofita p = new Pteridofita(partes[0]);
        p.setNome(partes[1]);
        p.setTamanho(Double.parseDouble(partes[2]));
        plantas.add(p);
      }
    }

    return plantas;
  }
}
