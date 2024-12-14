public class Main {
  public static void main(String[] args) {
    Leao x = new Leao();
    x.setNome("Simba");
    x.setIdade(12);
    x.correr();
    System.out.println(x);
    instance(x);

    Animal corrida[] = new Animal[3];
    corrida[0] = new Leao();
    corrida[1] = new Urso();
    corrida[2] = corrida[1];
    System.out.println(corrida[1].getNome());
    corrida[2].setNome("Nome Teste");
    System.out.println(corrida[1].getNome());

    int numbers[] = new int[3];
    System.out.println(numbers[0]);
    numbers[0] = 3;
    numbers[1] = numbers[0];
    numbers[0] = 8;
    System.out.println(numbers[1]);
    int numbers2[] = numbers;
    numbers2[0] = 4;
    System.out.println(numbers[0]);
  }

  public static void instance(Animal a) {
    a.correr();
    if (a instanceof Leao) {
      Leao l = (Leao) a;
      l.rugir();
    }
  }
}