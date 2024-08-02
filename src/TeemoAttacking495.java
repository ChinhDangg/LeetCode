package src;

public class TeemoAttacking495 {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int previous = timeSeries[0];
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] >= previous + duration) {
                count += duration;
            }
            else
                count += timeSeries[i] - previous;
            previous = timeSeries[i];
        }
        return count + duration;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,4}; int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));

        int[] timeSeries1 = {1,2}; int duration1 = 2;
        System.out.println(findPoisonedDuration(timeSeries1, duration1));

        int[] timeSeries2 = {1,3,5,7,9,11,13,15}; int duration2 = 3;
        System.out.println(findPoisonedDuration(timeSeries2, duration2));
    }
}
