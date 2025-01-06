import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();

    List lista = Utils.getLista();
    Produto produto = new Produto(id);

    if (Utils.existe(lista, produto)) {
      System.out.println(produto);
    }
  }

  public static Produto[] transformaListEmArray(List k) {
    List<Produto> produtos = new ArrayList<>();
    Iterator iterator = k.iterator();
    
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      if (obj instanceof Produto) {
        produtos.add((Produto) obj);
      }
    }

    return produtos.toArray(new Produto[0]);
  }
}