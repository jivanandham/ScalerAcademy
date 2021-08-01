package sample.array;

public class StepwiseSelectionSort {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] min = new int[n - 1];
        for (int i=0, k=0; i<n && k<min.length; i++, k++) {
            int smallest = A[i];
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[i] < smallest) {
                    smallest = A[j];
                    smallestIndex = j;
                }
            }
            min[k] = smallestIndex;
            if (smallestIndex != i) {
                int temp = A[i];
                A[i] = smallest;
                A[smallestIndex] = temp;
            }
        }
        return min;
    }
}
