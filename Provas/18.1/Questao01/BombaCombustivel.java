import java.util.ArrayList;

class BombaCombustivel {
  private double quantidadeLitros;
  private double precoPorLitro;

  public BombaCombustivel(double quantidadeLitros) {
    this.quantidadeLitros = quantidadeLitros;
    this.precoPorLitro = 4.5;
  }

  public void completarTanque(Abastecivel abastecivel) {
    double litrosAbastecidos = 0.0;

    while (abastecivel.abastecer(0.1) && quantidadeLitros > 0) {
      quantidadeLitros -= 0.1;
      litrosAbastecidos += 0.1;
    }

    System.out.printf(litrosAbastecidos + " - " + litrosAbastecidos*precoPorLitro);
  }

  public void abastecerFila(ArrayList x) {
    for (Object o : x) {
      if (o instanceof Abastecivel) {
        Abastecivel a = (Abastecivel) o;
        System.out.println(a);
        completarTanque(a);
      }
    }
  }
}