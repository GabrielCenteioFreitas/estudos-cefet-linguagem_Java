public class Main {
  public static String inverter(String str) {
    String strInvertida = "";
    for (int i = str.length()-1; i >= 0; i--) {
      strInvertida += str.charAt(i);
    }
    return strInvertida;
  }
}