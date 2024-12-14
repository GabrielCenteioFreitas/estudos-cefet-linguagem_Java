public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String raca;
    
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public String getNome() {
      return nome;
    }
  
    public void setIdade(int idade) {
      this.idade = idade;
    }
  
    public int getIdade() {
      return idade;
    }
    
    public void setPeso(double peso) {
      this.peso = peso;
    }
  
    public double getPeso() {
      return peso;
    }
  
    public void setRaca(String raca) {
      this.raca = raca;
    }
  
    public String getRaca() {
      return raca;
    }

    public void correr() {
      System.out.println("O animal " + nome + " está correndo!");
    }

    public String toString() {
        return nome + " " + idade;
    }
  }