package codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A == null || A.length == 0 || A.length == 1) return A;
        for (int i=0; i<K; ++i) {
            rotate(A);
        }
        return A;
    }

    private void rotate(int[] a) {
        int last = a[a.length-1];
        for (int i=a.length-1; i>0; --i) {
            a[i] = a[i-1];
        }
        a[0] = last;
    }
}
