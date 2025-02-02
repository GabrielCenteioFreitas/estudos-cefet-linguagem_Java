import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    BombaCombustivel bomba = new BombaCombustivel(5000);

    Carro carro = new Carro("HB20");
    bomba.completarTanque(carro);

    ArrayList<Object> f = new ArrayList<Object>();
    f.add(new Carro("1"));
    f.add(new Moto("2"));
    f.add(new Moto("3"));
    bomba.abastecerFila(f);
  }
}