package codility;

public class BinaryGap {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int maxGap = 0;
        int gap = 0;
        int idxFirst = binaryString.indexOf('1');
        if (idxFirst == -1) return 0;
        if (idxFirst == binaryString.lastIndexOf('1')) return 0;
        for (int i=idxFirst+1; i<binaryString.length(); ++i) {
            if (binaryString.charAt(i) == '1') {
                if (gap > maxGap) maxGap = gap;
                gap = 0;
            }
            if (binaryString.charAt(i) == '0') ++gap;
        }
        return maxGap;
    }
}
