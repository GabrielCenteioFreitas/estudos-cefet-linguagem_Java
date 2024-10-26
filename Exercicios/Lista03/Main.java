package Faculdade.Exercicios.Lista03;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    System.out.println(conta.getDataAberturaFormatada());
    System.out.println(conta.getSaldoFormatado());
    conta.depositar(100);
    System.out.println(conta.getSaldoFormatado());
    conta.sacar(60);
    System.out.println(conta.getSaldoFormatado());
    conta.depositar(1500);
    System.out.println(conta.getSaldoFormatado());
  }
}
