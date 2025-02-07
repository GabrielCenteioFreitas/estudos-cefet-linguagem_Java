import java.util.ArrayList;
import java.util.List;

public class CriaPaises {
  public static List<Pais> retornaPaises() {
    List<Pais> l = new ArrayList<Pais>();
    Pais us = new Pais("US", "Estados Unidos", 10000);
    Pais ca = new Pais("CA", "Canada", 9000);
    Pais me = new Pais("ME", "Mexico", 7000);
    us.addFronteirico(ca);
    us.addFronteirico(me);
    ca.addFronteirico(us);
    me.addFronteirico(us);
    l.add(us);
    l.add(ca);
    l.add(me);
   
    return l;
  }

  public static List<Pais> retornaPaises(String[] input) throws FormatoIncorretoException {
    List<Pais> l = new ArrayList<Pais>();

    for (String str : input) {
      String[] partes = str.split("#");
 
      if (partes.length < 4) {
	      throw new FormatoIncorretoException(partes.length - 1, str);
      }

      Pais p = new Pais(partes[0], partes[1], Double.parseDouble(partes[2]));
      p.setPop(Double.parseDouble(partes[3]));
      l.add(p);
    }

    return l;
  }
}