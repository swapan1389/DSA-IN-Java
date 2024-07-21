public class ArraysExample1{
    public static void main(String[] args) {
        int[] marks=new int[3];
        //int marks[]={92,89,96};  //when it is known previously that what to store in the array
        marks[0]=92;
        marks[1]=89;
        marks[2]=96;
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        
        
    }

}