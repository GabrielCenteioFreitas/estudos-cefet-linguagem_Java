import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    HashSet<String> x = new HashSet<String>();
    x.add("casa");
    x.add("mesa");
    x.add("casa");
    x.add("toalha");
    System.out.println(x);
    int soma1 = 0;
    Iterator<String> it = x.iterator();
    while (it.hasNext()) {
      String p = it.next();
      soma1 += p.length();
    }
    double media1 = (double) soma1 / x.size();
    System.out.println(media1);

    Map<String, Aluno> m = new HashMap<String, Aluno>();
    m.put("matricula-01", new Aluno("matricula-01"));
    Aluno a2 = new Aluno("matricula-02");
    a2.setP1(10);
    a2.setP2(9.9);
    m.put(a2.getMatricula(), a2);
    System.out.println(m);
    int soma2 = 0;
    Set<String> keys = m.keySet();
    for (String key : keys) {
      System.out.println(key + " - " + m.get(key));
      soma2 += m.get(key).getP1();
    }
    double media2 = (double) soma2 / m.size();
    Collection<Aluno> values = m.values();
    for (Aluno value : values) {
      System.out.println(value);
    }
    System.out.println(media2);
    m.remove("matricula-01");
    System.out.println(m);
  }
}