public class TextoCurtoException extends Exception {
  public TextoCurtoException(int qnt) {
    super("Texto inserido com " + qnt + " caracteres");
  }
}