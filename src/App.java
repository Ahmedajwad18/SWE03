public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 5, 9, 3, 7, 3, 7 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void sel_sort(int numArray[]) {
        int n = numArray.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (numArray[j] < numArray[min_idx])
                    min_idx = j;

            int temp = numArray[min_idx];
            numArray[min_idx] = numArray[i];
            numArray[i] = temp;
        }
    }
}
