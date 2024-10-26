public class Main {
  public static void main(String args[]) {
    int array[] = new int[3];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;

    int soma = 0;
    for (int i = 0; i < array.length; i++) {
      soma += array[i];
    }

    System.out.println(soma);
  }
}