public class CriaturaMarinha {
  private String tag;
  private String nomeEspecie;
  private int profundidadeEncontrada;

  public CriaturaMarinha(String t, String n, int p) {
    this.tag = t;
    this.nomeEspecie = n;
    this.profundidadeEncontrada = p;
  }

  public String getTag() {
    return this.tag;
  }

  public String getNomeEspecie() {
    return this.nomeEspecie;
  }

  public int getProfundidadeEncontrada() {
    return this.profundidadeEncontrada;
  }

  public String toString() {
    return "Tag: " + tag + "; Especie: " + nomeEspecie + "; Profundidade encontrada: " + profundidadeEncontrada + " metros";
  }
}