public class Carro extends Veiculo implements Abastecivel {
  private final double tamanhoTanque;
  private double quantidadeAtual;

  public Carro(String modelo) {
      super(modelo);
      this.tamanhoTanque = 50.0;
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
      if (quantidadeAtual + litros > tamanhoTanque) {
          return false;
      }
      quantidadeAtual += litros;
      return true;
  }
}