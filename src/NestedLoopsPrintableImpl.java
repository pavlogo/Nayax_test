public class NestedLoopsPrintableImpl implements MatrixPrintable {

    public static void print(int[][] data) throws NullPointerException {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; (data[i] != null && j < data[i].length); j++) {
                System.out.print(data[i][j] + " ");
            }
            if (data[i] != null && data[i].length == 0) {
                System.out.print("empty ");
            }
            if (data[i] == null) {
                System.out.print("null ");
            }
            System.out.println();
        }
    }
}
