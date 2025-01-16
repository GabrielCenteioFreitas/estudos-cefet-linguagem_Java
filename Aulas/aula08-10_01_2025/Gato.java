public class Gato {
	public String nome;
	public int idade;

  public Gato(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Gato) {
      Gato gato = (Gato) obj;

      return (gato.nome == this.nome && gato.idade == this.idade);
    }

    return false;
  }

  public String toString() {
    return this.nome + " - " + this.idade;
  }
}