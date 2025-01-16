import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o id: ");
    String id = scanner.nextLine();
    Produto p = new Produto(id);
    List<Object> lista = Utils2.getLista();
    if (Utils.existe(lista, p)) {
      for (Object o : lista) {
        if(p.equals(o)) {
          Produto p2 = (Produto) o;
          p.setCor(p2.getCor());
          p.setPreco(p2.getPreco());
          break;
        }
      }
      System.out.println(p);
    }
  }

  public Produto[] transformaListEmArray(List<Object> k) {
    ArrayList<Produto> ps = new ArrayList()<Produto>();

    for (Object o : k) {
      if (o instanceof Produto) {
        ps.add((Produto) o);
      }
    }

    return ps.toArray(new Produto[0]);
  }

  public double calculaSoma(Produto[] ps) {
    double soma = 0.0;

    for (Produto p : ps) {
      soma += p.getPreco();
    }

    return soma;
  }
}