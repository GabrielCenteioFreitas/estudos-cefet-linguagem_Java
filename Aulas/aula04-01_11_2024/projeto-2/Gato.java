public class Gato {
  private String nome;
  private int idade;
  
  // public void setNome(String nome) {
  //   this.nome = nome;
  // }

  public String getNome() {
    return nome;
  }

  // public void setIdade(int idade) {
  //   this.idade = idade;
  // }

  public int getIdade() {
    return idade;
  }

  public Gato(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
}