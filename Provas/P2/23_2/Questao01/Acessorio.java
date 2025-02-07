public abstract class Acessorio {
  protected String marca;
  protected double preco;

  public String getMarca() {
    return this.marca;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public abstract double calcularImposto();

  public Acessorio(String marca, double preco) {
    this.marca = marca;
    this.preco = preco;
  }
}