public class Funcionario {
  private String cpf;
  private int idade;
  
  public Funcionario(String c, int i) {
    cpf = c;
    idade = i;
  }

  public String getCpf() {
    return cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}