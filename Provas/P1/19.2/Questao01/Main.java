import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    Biscoito b = new Biscoito(id);
    List<Object> lista = Utils2.getLista();
    if (Utils.existe(lista, b)) {
      for (Object obj : lista) {
        if (b.equals(obj)) {
          Biscoito b2 = (Biscoito) obj;
          b.setCor(b2.getCor());
          b.setPreco(b2.getPreco());
          break;
        }
      }

      System.out.println(b.getId() + "#" + b.getCor() + "#" + b.getPreco());
    }
  }

  public Biscoito[] transformaListEmArray(List<Object> k) {
    ArrayList<Biscoito> bs = new ArrayList<Biscoito>();

    for (Object o : k) {
      if (o instanceof Biscoito) {
        Biscoito b = (Biscoito) o;
        bs.add(b);
      }
    }

    return bs.toArray(new Biscoito[0]);
  }

  public void calcularSoma(Biscoito bs[]) {
    int soma = 0;
 
    for (Biscoito b : bs) {
      soma += b.getPreco();
    }

    System.out.println(soma);
  }
}