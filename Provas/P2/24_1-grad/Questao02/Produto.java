public class Produto {
  private String id;
  private String cor;
  private double preco;

  public String getCor() {
    return cor;
  }

  public String getId() {
    return id;
  }

  public double getPreco() {
    return preco;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Produto(String id) {
    this.id = id;
  }

  public String toString() {
    return "ID: " + id + ", Cor: " + cor + ", Preco: " + preco;
  }
}
