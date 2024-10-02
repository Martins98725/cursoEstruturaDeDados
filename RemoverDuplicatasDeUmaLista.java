package Algoritmos;

import java.util.Arrays;

public class RemoverDuplicatasDeUmaLista {
    public static void main(String[] args) {
        int[] vetor1 = {1, 1, 2};
        System.out.println(Arrays.toString(deleteDuplicates(vetor1)));


    }
    public static int[] deleteDuplicates(int[] head) {
      int temp =  0;
      for (int i = 0; i < head.length; i++) {
          if (head[i] == head[temp]) {
              temp = head[i];
          }
          for (int j = i + 1; j < head.length; j++) {
              if (head[i] == head[j]) {
                  temp = head[i];
                  break;
              }
          }
          head[temp] = head[i];
      }
      return head;
    }
}
