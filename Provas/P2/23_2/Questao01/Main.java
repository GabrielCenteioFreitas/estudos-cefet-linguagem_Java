import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Carro> l = new ArrayList<Carro>();
    Carro c1 = new Carro("ABC1234", "Preto", 2025, "987654321");
    c1.addAcessorio(new Som("Marca01", 100));
    c1.addAcessorio(new VidroEletrico("Marca02", 200));
    Carro c2 = new Carro("XYZ5678", "Branco", 2025, "123456789");
    c2.addAcessorio(new Som("Marca03", 300));
    c2.addAcessorio(new VidroEletrico("Marca04", 400));
    l.add(c1);
    l.add(c2);
  }
}