package org.example;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class PrimeTests {

  @Test
  public void testPrime(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }
  @Test
  public void testPrimeFast(){
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }
//  @Test
//  public void testPrimeFastMore(){
//    Assert.assertTrue(Primes.isPrimeFastMore(Integer.MAX_VALUE));
//  }
  @Test
  public void testPrimeLong(){
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
  @Test
  public void testNonPrime(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
}
