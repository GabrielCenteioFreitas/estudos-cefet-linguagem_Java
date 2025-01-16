import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> array = new ArrayList<String>();
    array.add("Gato");
    array.add("Mesa");
    array.add("Porta");
    array.add("Teclado");
    System.out.println(array);
    System.out.println(array.size());
    System.out.println(array.get(0));
    System.out.println(array.indexOf("Mesa"));
    System.out.println(array.contains("Mesa"));
    array.remove("Teclado");

    for (String m : array) {
      System.out.println(m);
    }

    ArrayList<Gato> gatos = new ArrayList<Gato>();
    gatos.add(new Gato("Gato 1", 10));
    gatos.add(new Gato("Gato 2", 20));
    gatos.add(new Gato("Gato 3", 30));
    System.out.println(gatos);
    System.out.println(gatos.contains(new Gato("Gato 1", 10)));

    String frase = "A casa amarela";
    String palavras[] = frase.split(" ");
    int soma = 0;
    for (String palavra : palavras) {
      soma += palavra.length();
    }
    System.out.println(((double) soma) / palavras.length);

    String a = "  A cAsA bOnITa          ";
    String b = a.toLowerCase();
    String c = b.trim();
    String d[] = c.split(" ");
  }
}