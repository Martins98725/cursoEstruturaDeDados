package Algoritmos;

import java.util.HashMap;
import java.util.Map;

public class SomaDeDoisNumerosNaArray {
    public static void main(String[] args) {
        SomaDeDoisNumerosNaArray  soma = new SomaDeDoisNumerosNaArray();
        int[] sumsArrays = {2,7,11,15};
        int target = 9;

        int[] result = soma.twoSum(sumsArrays, target);
        System.out.println("Índices: [" + result[0] + ", " + result[1] + "]");

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("Nenhuma solução encontrada.");
    }
}
