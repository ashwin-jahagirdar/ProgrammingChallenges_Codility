package codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        double totalDist = Y - X;
        return (int) Math.ceil(totalDist / D);
    }
}
