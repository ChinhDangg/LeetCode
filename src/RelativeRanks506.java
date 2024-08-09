package src;

import java.util.Arrays;

public class RelativeRanks506 {

    public static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int[] copy = new int[len];
        System.arraycopy(score, 0, copy, 0, len);
        Arrays.sort(copy);

        String[] temp = new String[copy[len-1]+1];
        int rank = len;
        for (int i = 0; i < len; i++) {
            switch (rank) {
                case 1:
                    temp[copy[i]] = "Gold Medal";
                    break;
                case 2:
                    temp[copy[i]] = "Silver Medal";
                    break;
                case 3:
                    temp[copy[i]] = "Bronze Medal";
                    break;
                default:
                    temp[copy[i]] = String.valueOf(rank);
            }
            rank--;
        }

        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            result[i] = temp[score[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));

        int[] score2 = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score2)));
    }
}
