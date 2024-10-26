import java.util.Scanner;

public class Desafio2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Pessoa array[] = new Pessoa[3];

    int somaDasIdades = 0;
    //float somaDasIdades = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = new Pessoa();
      System.out.print("Nome da " + (i+1) + "a pessoa: ");
      array[i].nome = scanner.nextLine();
      System.out.print("Idade da " + (i+1) + "a pessoa: ");
      array[i].idade = scanner.nextInt();

      somaDasIdades += array[i].idade;
      scanner.nextLine();
    }

    float mediaDasIdades = (float) somaDasIdades / array.length;
    //float mediaDasIdades =  somaDasIdades / array.length;
    System.out.println("Media das idades: " + mediaDasIdades);

    scanner.close();
  }
}