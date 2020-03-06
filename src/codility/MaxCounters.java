package codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int minValueForAllCounters = 0;
        for (int i=0; i<A.length; ++i) {
            int counterNo = A[i];
            if (counterNo >= 1 && counterNo <= N) {
                counters[counterNo-1] = Math.max(minValueForAllCounters+1, counters[counterNo-1]+1);
                if (counters[counterNo-1] > currentMax) {
                    currentMax = counters[counterNo-1];
                }
            } else {
                minValueForAllCounters = currentMax;
            }
        }
        for (int i=0; i<N; ++i) {
            if (counters[i] < minValueForAllCounters) {
                counters[i] = minValueForAllCounters;
            }
        }
        return counters;
    }
}
