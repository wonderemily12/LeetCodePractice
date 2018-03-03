public class HammingDistance {
    public int hammingDistance(int x, int y) {
            int bitCount = 0;
            int xor = x ^ y;
            while (xor != 0) {
                bitCount += xor & 1;
                xor >>= 1;
            }
            return bitCount;
        }
}
