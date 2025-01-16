public class Media {
  public static double calcula(String numeros) {
    int soma = 0;
    String partes[] = numeros.split("#");

    for (String p : partes) {
      soma += Integer.parseInt(p);
    }

    double media = ((double) soma) / partes.length;
    return media;
  }
}