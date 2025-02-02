public class Planta {
  private String id;
  private String nome;
  private double tamanho;

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Planta(String id) {
    this.id = id;
  }

  public String toString() {
    return "ID: " + id + ", Nome: " + nome + ", Tamanho: " + tamanho + " cm";
  }

  public boolean equals(Object obj) {
    if (obj instanceof Planta) {
      Planta p = (Planta) obj;
      return id.equals(p.id);
    }
    return false;
  }
}
