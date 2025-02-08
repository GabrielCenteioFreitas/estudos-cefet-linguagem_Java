import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {
  public static void main(String[] args) {
    List<Animal> lista = new ArrayList<Animal>();
    lista.add(new Cachorro());
    lista.add(new Pato());
    for (Animal a : lista) {
      a.emitirSom();
      a.mover();
    }
  }
}
