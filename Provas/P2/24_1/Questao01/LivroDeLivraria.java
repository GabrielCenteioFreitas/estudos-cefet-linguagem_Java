public class LivroDeLivraria extends Livro {
  private boolean vendido;

  public boolean getVendido() {
    return this.vendido;
  }

  public void setVendido(boolean vendido) {
    this.vendido = vendido;
  }

  public LivroDeLivraria(String isbn) {
    super(isbn);
  }

  public LivroDeLivraria(String titulo, String autor, int ano, String isbn) {
    super(titulo, autor, ano, isbn);
  }
}
