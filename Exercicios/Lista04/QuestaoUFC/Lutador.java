import java.util.ArrayList;
import java.util.Random;

public abstract class Lutador {
  private String nome;
  private int idade;
  private double peso;

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getPeso() {
    return peso;
  }

  public Lutador(String nome, int idade, double peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  public String categoriaLutador() {
    if (this instanceof PesoPesado) {
      return "Peso pesado";
    }
    if (this instanceof MeioPesado) {
      return "Meio pesado";
    }
    if (this instanceof PesoMedio) {
      return "Peso medio";
    }
    if (this instanceof PesoPena) {
      return "Peso pena";
    }
    return "";
  }

  public void possiveisLutas(Lutador[] lutadores) {
    for (int i = 0; i < lutadores.length; i++) {
      if (
        this.categoriaLutador().equals(lutadores[i].categoriaLutador()) &&
        !this.toString().equals(lutadores[i].toString())
      ) {
        System.out.println(lutadores[i].toString());
      }
    }
  }

  public Lutador sorteioLuta(Lutador[] lutadores) {
    ArrayList<Lutador> lutadoresDaMesmaCategoria = new ArrayList<Lutador>();

    for (int i = 0; i < lutadores.length; i++) {
      if (
        this.categoriaLutador().equals(lutadores[i].categoriaLutador()) &&
        !this.toString().equals(lutadores[i].toString())
      ) {
        lutadoresDaMesmaCategoria.add(lutadores[i]);
      }
    }

    if (lutadoresDaMesmaCategoria.isEmpty()) {
      return null;
    }

    int indiceSorteado = (int) (Math.random() * lutadoresDaMesmaCategoria.size());

    return lutadoresDaMesmaCategoria.get(indiceSorteado);
  }

  public String toString() {
    return nome + "/" + idade + "/" + peso;
  }
}