import java.util.ArrayList;

public class Instituicao {
  private String nome;
  private ArrayList<Livro> listaDeLivros;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Livro> getListaDeLivros() {
    return listaDeLivros;
  }

  public void addLivro(Livro l) {
    listaDeLivros.add(l);
  }

  public Instituicao() {
    listaDeLivros = new ArrayList<Livro>();
  }
}
