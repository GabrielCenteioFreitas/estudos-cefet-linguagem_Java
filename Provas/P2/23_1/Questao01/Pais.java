import java.util.ArrayList;
import java.util.List;

public class Pais {
  private String codigo;
  private String nome;
  private double pop;
  private double dim;
  private List<Pais> paisesFronteira;
  
  public Pais(String codigo) {
    this.codigo = codigo.toUpperCase();
    this.paisesFronteira = new ArrayList<Pais>();
  }

  public Pais(String codigo, String nome, double dim) {
    this(codigo);
    this.nome = nome;
    this.dim = dim;
  }

  public boolean equals(Object o) {
    if (o instanceof Pais) {
      Pais p = (Pais) o;
      return this.codigo.equals(p.codigo);
    }
    return false;
  }

  public String toString() {
    return "COD: " + this.codigo + " - NOME: " + this.nome + " - POPULACAO: " + this.pop + " - DIMENSAO: " + this.dim;
  }

  public String getNome() {
    return this.nome;
  }

  public double getPop() {
    return this.pop;
  }

  public double getDim() {
    return this.dim;
  }

  public void setPop(double pop) {
    this.pop = pop;
  }

  public double getDensidade() {
    return this.pop / this.dim;
  }

  public List<Pais> getFronteiricos() {
    return this.paisesFronteira;
  }

  public boolean fazFronteira(Pais p) {
    return this.paisesFronteira.contains(p);
  }

  public void addFronteirico(Pais p) {
    this.paisesFronteira.add(p);
  }
}