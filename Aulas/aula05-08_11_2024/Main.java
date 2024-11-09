public class Main {
  public static void main(String[] args) {
    Funcionario f = new Funcionario("111.222.333-44", 1);
    System.out.println(f.getCpf());
    System.out.println(f.getIdade());

    System.out.println((int) (Math.random() * 100));
    System.out.println(Math.PI);

    System.out.println(Calculadora.media(4, 6));

    System.out.println("Valor: " + 15 + 10);

    String a = "abc";
    String b = "abc";
    System.out.println(a == b);
    String c = new String("abc");
    String d = new String("abc");
    System.out.println(c.equals(d));
  }
}