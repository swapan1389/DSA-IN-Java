public class StringBuilder1 {
    public static void main(String[] args) {

        // StringBuilder Create
        StringBuilder sb = new StringBuilder("Swapan");
        System.out.println(sb); // Swapan

        // charAt index 0
        System.out.println(sb.charAt(0)); // S


        // Set char at index
        sb.setCharAt(0, 'J');
        System.out.println(sb); // Jwapan

        //Insert
        sb.insert(3, "o");
        System.out.println(sb); // Jwaopan

        //remove
        sb.delete(4, 5);
        System.out.println(sb); // Jwaoan

        // Append
        StringBuilder sb1=new StringBuilder("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1); // hello
        
    }
    
}
