import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
  public static List<Ligavel> filtrarLigaveis(List<Object> objetos) {
    List<Ligavel> l = new ArrayList<Ligavel>();
    
    for (Object o : objetos) {
      if (o instanceof Ligavel) {
        l.add((Ligavel) o);
      }
    }

    return l;
  }

  public static void main(String[] args) {
    List<Object> l = Utils.getLista();
    List<Ligavel> lg = filtrarLigaveis(l);

    double soma = 0;
    for (Ligavel g : lg) {
      soma += ((Produto) g).getPreco();
    }
    System.out.println(soma / lg.size());
  }
}
