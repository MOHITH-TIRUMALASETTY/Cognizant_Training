public class HandaOn10A {
    public void printArray(int[] arr) {
        System.out.println("Integer Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printArray(double[] arr) {
        System.out.println("Double Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printArray(char[] arr) {
        System.out.println("Character Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         
    HandaOn10A printer = new HandaOn10A();

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.1, 2.2, 3.3};
        char[] charArr = {'A', 'B', 'C'};

        printer.printArray(intArr);
        printer.printArray(doubleArr);
        printer.printArray(charArr);

    }
}



