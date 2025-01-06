public class Main {
  public static void print(int[] array) {
    System.out.print("[");
      for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i != array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    int[] array = {1, 7, 6, 5, 9, 8, 3, 4, 2, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    
    print(array);

    int[] arrayInvertido = inverterArray(array);
    
    print(arrayInvertido);
  }

  public static int[] inverterArray(int[] array) {
    int[] arrayInvertido = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      arrayInvertido[i] = array[array.length - 1 - i];
    }

    return arrayInvertido;
  }
}