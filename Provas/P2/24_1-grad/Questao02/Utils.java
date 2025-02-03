import java.util.ArrayList;
import java.util.List;

public class Utils {
  public static List<Object> getLista() {
    List<Object> l = new ArrayList<Object>();
    l.add(new Tapete("ta-01"));
    l.add(new Tapete("ta-02"));
    Televisao te01 = new Televisao("te-01");
    te01.setPreco(10);
    l.add(te01);
    Televisao te02 = new Televisao("te-02");
    te02.setPreco(20);
    l.add(te02);
    return l;
  }
}
