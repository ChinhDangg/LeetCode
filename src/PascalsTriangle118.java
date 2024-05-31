package src;

import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        triangle.add(previous);

        for (int j = 1; j < numRows; j++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int k = 0; k < previous.size()-1; k++)
                current.add(previous.get(k) + previous.get(k+1));
            current.add(1);
            previous = current;
            triangle.add(previous);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 7;
        List<List<Integer>> triangle = generate(numRows);
        for (List<Integer> t : triangle)
            System.out.println(t);
    }
}
