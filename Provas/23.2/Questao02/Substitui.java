public class Substitui {
  static processa(String str) {
    String strMaiusculo = str.toUpperCase();
    for (int i = 0; i < str.length(); i++) {
      if (strMaiusculo.charAt(i) == 'A') {
        System.out.print(4);
      } else if (strMaiusculo.charAt(i) == 'E') {
        System.out.print(3);
      } else if (strMaiusculo.charAt(i) == 'I') {
        System.out.print(1);
      } else if (strMaiusculo.charAt(i) == 'O') {
        System.out.print(0);
      } else {
        System.out.print(strMaiusculo.charAt(i));
      }
    }
  }
}
