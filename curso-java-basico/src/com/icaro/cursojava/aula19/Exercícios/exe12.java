package com.icaro.cursojava.aula19.Exercícios;

public class exe12 {
  public static void main(String[] args) {

    int[] A = new int[10];

    A[0] = 10;
    A[1] = 20;
    A[2] = 30;
    A[3] = 40;
    A[4] = 50;
    A[5] = 60;
    A[6] = 70;
    A[7] = 80;
    A[8] = 90;
    A[9] = 100;

    int soma = 0;

    for (int i = 0; i < A.length; i++) {
      soma += A[i];

    }
    System.out.println("O valor da soma dos elementos do vetor é: " + soma);

  }

}
