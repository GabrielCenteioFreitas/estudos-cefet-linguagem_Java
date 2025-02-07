public class Som extends Acessorio {
  public Som(String marca, double preco) {
    super(marca, preco);
  }

  public double calcularImposto() {
    return super.getPreco() * 0.3;
  }
}