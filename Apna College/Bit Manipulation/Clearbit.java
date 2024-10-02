public class Clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int result = n & ~bitMask;
        System.out.println(result);
    }
}
