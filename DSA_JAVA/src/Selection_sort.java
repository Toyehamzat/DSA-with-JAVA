public class Selection_sort {

    public void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

    }

    public static void main(String[] args) throws Exception {
        int[] array = new int[] { 6, 1, 3, 8, 2, 9, 4, 7, 5, 10 };
        Selection_sort ss = new Selection_sort();
        ss.printArray(array);
        ss.sort(array);
        ss.printArray(array);
    }
}
