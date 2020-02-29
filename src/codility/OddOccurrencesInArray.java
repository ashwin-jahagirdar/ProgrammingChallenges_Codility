package codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<A.length; ++i) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        return set.toArray(new Integer[set.size()])[0];
    }
}
