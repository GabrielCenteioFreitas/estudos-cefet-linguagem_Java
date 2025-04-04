public abstract class Veiculo {
  private String modelo;

  public Veiculo(String modelo) {
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String toString() {
    return modelo;
  }
}

interface Abastecivel {
  boolean abastecer(double litros);
}