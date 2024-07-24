package src;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch401 {

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<String>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn)
                    result.add(String.format("%d:%02d", h, m));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
        System.out.println(readBinaryWatch(9));
    }
}
