
public class SingleLoopPrintableImpl implements MatrixPrintable {

    public static void print(int[][] data) throws NullPointerException {

        for (int j = 0, i = 0; j < data.length; ) {

            if (data[j] != null && data[j].length == 0) {
                System.out.print("\n" + "empty " + "\n");
            }
            if (data[j] == null) {
                System.out.print("\n" + "null " + "\n");
            }

            if (data[j] != null && i < data[j].length) {

                System.out.print(data[j][i] + " ");
                ++i;

            } else {
                i = 0;
                ++j;
            }
        }
    }
}
