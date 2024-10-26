package Faculdade.Exercicios.Lista03;

import java.text.NumberFormat;
import java.util.Locale;

public class ContaBancaria {
  private double saldo = 0.0;
  private Data dataAbertura = new Data();

  public Data getDataAbertura() {
    return dataAbertura;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setDataAbertura(Data dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getDataAberturaFormatada() {
    return dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno();
  }

  public String getSaldoFormatado() {
    NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
    return formatador.format(saldo);
  }

  public void depositar(double deposito) {
    saldo += deposito;
  }

  public void sacar(double saque) {
    if (saque <= saldo) {
      saldo -= saque;
    }
  }

  public ContaBancaria() {
    dataAbertura.setDia(26);
    dataAbertura.setMes(10);
    dataAbertura.setAno(2024);
  }
}
