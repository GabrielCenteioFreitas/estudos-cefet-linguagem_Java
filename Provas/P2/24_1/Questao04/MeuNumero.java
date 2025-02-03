import java.util.ArrayList;

public class MeuNumero {
  public static double media(String str) throws NumeroNegativoException {
    String[] nums = str.split("#");

    double soma = 0;
    int n;

    for (String numString : nums) {
      n = Integer.parseInt(numString);

      if (n < 0) {
        throw new NumeroNegativoException(numString);
      }

      soma += n;
    }

    return (soma / nums.length);
  }
}

