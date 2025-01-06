import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    Biscoito biscoito = new Biscoito(id);
    if (Utils.existe(Utils2.getLista(), biscoito)) {
      System.out.println(biscoito);
    }
  }

  public Biscoito[] transformaListEmArray(List k) {
    ArrayList<Biscoito> biscoitos = new ArrayList<Biscoito>();
    for (int i = 0; i < k.size(); i++) {
      if (k.get(i) instanceof Biscoito) {
        biscoitos.add((Biscoito) k.get(i));
      }
    }

    Biscoito biscoitosArray[] = new Biscoito[biscoitos.size()];
    for (int i = 0; i < biscoitos.size(); i++) {
      biscoitosArray[i] = biscoitos.get(i);
    }

    return biscoitosArray;
  }

  public void calcularSoma(Biscoito[] biscoitos) {
    int soma = 0;
    for (int i = 0; i < biscoitos.length; i++) {
      soma += biscoitos[i].getPreco();
    }
    System.out.println(soma);
  }
}