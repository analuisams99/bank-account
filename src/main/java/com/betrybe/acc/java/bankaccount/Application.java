package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**Classe Application. */
public class Application {

  /**Método principal. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AccountNumberFormatter accountNumberFormatter = new AccountNumberFormatter(); 
    System.out.println("Informe o número da conta: ");
    
    try {
      int numeroConta = scanner.nextInt();
      String numeroContaFormatado = accountNumberFormatter.formatAccountNumber(numeroConta);
      System.out.println("Numero da conta: " + numeroContaFormatado);

    } catch (Exception e) {
      System.out.println("Numero da conta inválido!");

    } finally {
      scanner.close();
    }
  }

}
