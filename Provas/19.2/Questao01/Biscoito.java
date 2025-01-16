interface Comestivel {
  void comer();
}

public class Biscoito implements Comestivel {
  private String id;
  private String cor;
  private int preco;

  public String getId() {
    return this.id;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getPreco() {
    return this.preco;
  }

  public void setPreco(int preco) {
    this.preco = preco;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Biscoito) {
      Biscoito b = (Biscoito) obj;
      return id.equals(b.id);
    }

    return false;
  }

  public void comer() {
    System.out.println("Comendo biscoito.");
  }

  public Biscoito(String id) {
    this.id = id;
  }
}