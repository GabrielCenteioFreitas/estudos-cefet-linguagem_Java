public class Planta {
  private String id;
  private String nome;
  private double tamanho;

  public String getId() {
    return id;
  }
  public String getNome() {
    return nome;
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setId(String id) {
    this.id = id;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Planta) {
      Planta p = (Planta) obj;
      return id.equals(p.id);
    }

    return false;
  }

  public String toString() {
    return id + " " + nome + " " + tamanho;
  }

  public Planta(String id) {
    this.id = id;
  }
}