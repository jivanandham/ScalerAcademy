package sample.array;

public class KthSmallestNumber {
    public int kthSmallest(final int[] A, int B) {
        Arrays.sort(A);
        int min = 0;
        for (int i=0; i<A.length; i+=) {
            if (i == B-1)
                min = A[i];
        }
        return min;
    }
}
