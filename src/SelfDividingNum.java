import java.util.ArrayList;
import java.util.List;
public class SelfDividingNum {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> sdNums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            ArrayList<Integer> selfDivisors = new ArrayList<>();
            for (int j = i; j > 0; j = j / 10) {
                selfDivisors.add(j % 10);
            }
            boolean isSelfDividing = true;
            for (int divisor : selfDivisors) {
                if (divisor == 0 || i % divisor != 0) {
                    isSelfDividing = false;
                    break;
                }
            }
            if (isSelfDividing) sdNums.add(i);
        }
        return sdNums;
    }
}
