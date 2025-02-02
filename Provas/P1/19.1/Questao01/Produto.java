interface Eletronico {
  void ligar();
  void desligar();
}

public class Produto {
  private String id;
  private String cor;
  private double preco;
  
  public String getId() {
    return this.id;
  }
  
  public String getCor() {
    return this.cor;
  }
  
  public void setCor(String cor) {
    this.cor = cor;
  }
  
  public double getPreco() {
    return this.preco;
  }
  
  public void setPreco(double preco) {
    this.preco = preco;
  }

  public boolean equals(Object o) {
    if (o instanceof Produto) {
      Produto p = (Produto) o;
      return id.equals(p.id);
    }
    return false;
  }

  public String toString() {
    return "[" + id + " - " + cor + " - " + preco + "]";
  }

  public Produto(String id) {
    this.id = id;
  }
}