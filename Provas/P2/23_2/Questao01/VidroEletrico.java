public class VidroEletrico extends Acessorio {
  public VidroEletrico(String marca, double preco) {
    super(marca, preco);
  }

  public double calcularImposto() {
    return super.getPreco() * 0.2;
  }
}