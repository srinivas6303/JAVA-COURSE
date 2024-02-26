public class DSA_Mergesort {
    public void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public void merge(int arr[], int l, int m, int h) {
        // Merge process implementation
        // ...
    }
}