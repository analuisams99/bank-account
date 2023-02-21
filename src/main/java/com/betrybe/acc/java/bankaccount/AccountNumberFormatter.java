package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {
  private static final int NUM_MAX = 6;
  private static final String CHAR_ESPECIAL = "0";

  /**
   * Classe formatAccountNumber
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String stringNumero = Integer.toString(literalAccountNumber);
    
    if (stringNumero.length() > 6) {
      return StringUtils.right(stringNumero, NUM_MAX);
    }
    return StringUtils.leftPad(stringNumero, NUM_MAX, CHAR_ESPECIAL);
  }

}