import java.util.*;

public class PascalsTriangleRow {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> result = getRow(rowIndex);
        System.out.println(result); // Output: [1, 4, 6, 4, 1]
    }
}