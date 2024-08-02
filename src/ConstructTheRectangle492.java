package src;

import java.util.Arrays;

public class ConstructTheRectangle492 {

    public static int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width != 0)
            width--;
        return new int[] {area / width, width};
    }

    public static void main(String[] args) {
        int area = 4;
        System.out.println(Arrays.toString(constructRectangle(area)));

        int area1 = 37;
        System.out.println(Arrays.toString(constructRectangle(area1)));

        int area2 = 122122;
        System.out.println(Arrays.toString(constructRectangle(area2)));
    }
}
