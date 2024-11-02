public class Main {
  public static void main(String[] args) {
    Gato g = new Gato("G1", 8);
    //g.setNome("G1");
    //g.setIdade(8);
    System.out.println("Nome do gato: " + g.getNome());
    System.out.println("Idade do gato: " + g.getIdade());
  }
}