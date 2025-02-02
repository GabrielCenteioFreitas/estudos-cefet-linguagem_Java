public class Produto {
  private String id;
  private String cor;
  private double preco;

  public String getId() {
    return id;
  }

  public String toString() {
    return id + " " + cor + " " + preco;
  }

  public boolean equals(Produto prod) {
    return id.equals(prod.id);
  }

  public Produto(String id) {
    this.id = id;
  }
}