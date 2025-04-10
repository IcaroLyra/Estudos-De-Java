package com.icaro.cursojava.aula19.Exercícios;

public class exe2 {
  public static void main(String[] args) {

    int[] A = new int[5];
    int[] B = new int[5];

    A[0] = 10;
    A[1] = 20;
    A[2] = 30;
    A[3] = 40;
    A[4] = 50;

    for (int i = 0; i < A.length; i++) {
      B[i] = 2 * A[i];

    }

    System.out.println("Vetor A:");
    for (int i = 0; i < A.length; i++) {
      System.out.println("A[" + i + "] = " + A[i]);
    }

    System.out.println("\nVetor B:");
    for (int i = 0; i < B.length; i++) {
      System.out.println("B[" + i + "] = " + B[i]);
    }

  }

}
