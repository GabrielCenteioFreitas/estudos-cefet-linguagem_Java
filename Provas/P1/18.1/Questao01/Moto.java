public class Moto extends Veiculo implements Abastecivel {
  private final double tamanhoTanque;
  private double quantidadeAtual;

  public Moto(String modelo) {
      super(modelo);
      this.tamanhoTanque = 25.0;
      this.quantidadeAtual = 0.0;
  }

  public double getTamanhoTanque() {
      return tamanhoTanque;
  }

  public double getQuantidadeAtual() {
      return quantidadeAtual;
  }

  public void setQuantidadeAtual(double quantidadeAtual) {
      this.quantidadeAtual = quantidadeAtual;
  }

  @Override
  public boolean abastecer(double litros) {
      if (quantidadeAtual + litros > 0.99 * tamanhoTanque) {
          return false;
      }
      quantidadeAtual += litros;
      return true;
  }
}