public class LivroDeBiblioteca extends Livro {
  private boolean alugado;

  public boolean getAlugado() {
    return this.alugado;
  }

  public void setAlugado(boolean alugado) {
    this.alugado = alugado;
  }

  public LivroDeBiblioteca(String isbn) {
    super(isbn);
  }

  public LivroDeBiblioteca(String titulo, String autor, int ano, String isbn) {
    super(titulo, autor, ano, isbn);
  }
}
