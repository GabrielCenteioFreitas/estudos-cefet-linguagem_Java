public class FormatoIncorretoException extends Exception {
  public FormatoIncorretoException(String str) {
    super("FormatoIncorretoException: O formato da String '" + str + "' esta incorreto.");
  }
}