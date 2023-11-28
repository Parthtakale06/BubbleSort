class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 2, 1, 4 };

        // To sort the given array we need to compare the cuurent ele with next ele and
        // then carry alongside operation regardin it
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}