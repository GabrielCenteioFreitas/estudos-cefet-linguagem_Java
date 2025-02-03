public class Livro {
  private String titulo;
  private String autor;
  private int ano;
  private String isbn;

  public int getAno() {
    return ano;
  }

  public String getAutor() {
    return autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public boolean equals(Object o) {
    if (o instanceof Livro) {
      Livro l = (Livro) o;
      return isbn.equals(l.isbn);
    }
    return false;
  }

  public Livro(String isbn) {
    this.isbn = isbn;
  }

  public Livro(String titulo, String autor, int ano, String isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.isbn = isbn;
  }
}
