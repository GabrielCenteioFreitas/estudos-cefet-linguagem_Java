public class Biscoito {
  private String id;
  private String cor;
  private int preco;

  public String getId() {
    return id;
  }

  public int getPreco() {
    return preco;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Biscoito) {
      Biscoito bisc = (Biscoito) obj;
      return id.equals(bisc.id);
    }
    return false;
  }

  public String toString() {
    return id + " " + cor + " " + preco;
  }

  public Biscoito(String id) {
    this.id = id;
  }
}