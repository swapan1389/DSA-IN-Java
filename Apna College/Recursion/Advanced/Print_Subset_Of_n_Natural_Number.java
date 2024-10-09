import java.util.ArrayList;

public class Print_Subset_Of_n_Natural_Number {
    public static void Printset(ArrayList<Integer>Subset){
        for(int i=0;i<Subset.size();i++){
            System.out.print(Subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void Find_Subset(int n,ArrayList<Integer>Subset){
        if(n==0){
            Printset(Subset);
            return;
        }

        // If The Number is added
        Subset.add(n);
        Find_Subset(n-1, Subset);

        // If the Number is not added
        Subset.remove(Subset.size()-1);
        Find_Subset(n-1, Subset);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Subset=new ArrayList<>();
        Find_Subset(3, Subset);
        
    }
    
}
