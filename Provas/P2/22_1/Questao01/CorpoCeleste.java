public class CorpoCeleste {
  private String id;
  private String nome;
  private double distancia;

  public CorpoCeleste(String id) {
    this.id = id;
  }

  public boolean equals(Object o) {
    if (o instanceof CorpoCeleste) {
      CorpoCeleste c = (CorpoCeleste) o; 
      return this.id.equals(c.id);
    }
    return false;
  }

  public String toString() {
    return "ID: " + id + " - Nome: " + nome + " - Distancia: " + distancia;
  }

  public String getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public double getDistancia() {
    return this.distancia;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }
}