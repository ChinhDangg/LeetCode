package src;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for (int j = 0; j < rowIndex; j++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for (int k = 0; k < current.size()-1; k++)
                next.add(current.get(k) + current.get(k+1));
            next.add(1);
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
