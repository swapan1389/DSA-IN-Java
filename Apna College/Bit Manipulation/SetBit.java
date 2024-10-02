public class SetBit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        System.out.println("Original Number: "+n);
        int NewNumber=bitmask | n;
        System.out.println("The new number after set bit is "+NewNumber);
    }
    
}
