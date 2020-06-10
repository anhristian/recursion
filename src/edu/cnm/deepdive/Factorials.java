package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Demonstrates recursive and iterative approaches to computing the factorial function directly.
 */

public class Factorials {

  /**
   * Recursively computes the factorial of the parameter {@code n}, processing and returning the
   * result as a {@link BigInteger}, for extended size values.
   *
   * @param n the {@code long} values for which the factorial function is to be computed.
   * @return  n!
   * @throws IllegalArgumentException when {@code n < 0}.
   */
  public static long computeRecursive(int n) throws IllegalArgumentException{
    long result;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = 1;
    }
    else{
      result = n * computeRecursive(n - 1);
    }
    return result;
  }
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    BigInteger result;
    if (n < 0) {

    }
  }




  public static long computeIterative(int n) throws IllegalArgumentException {
  long result;
    if(n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = 1;
    }
    else {
      result = n * computeIterative(n - 1);
    }
    return result;
  }

}
