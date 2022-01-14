
public class Main {
    public static void main(String[] args) {

        int[][] data = {{1, 2, 3},
                        {},
                        null,
                        {7, 8},
                        null,
                        {},
                        {999}};

        double rand = Math.random();

        if (rand < 0.5) {
            System.out.println("Nested loops method implemented"+"\n");
            NestedLoopsPrintableImpl.print(data);

        } else {
            System.out.println("Single loop method implemented"+"\n");
            SingleLoopPrintableImpl.print(data);
        }
    }
}

