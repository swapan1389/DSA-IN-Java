public class Call_Guest_In_Single_Or_Pairs {
    public static int Invite_Ways_Count(int n){

        if(n<=1){
            return 1;
        }
        // Call your guest single
        int sigleway=Invite_Ways_Count(n-1);
        // Call your guest in pairs
        int pairway=(n-1)*Invite_Ways_Count(n-2);
        return sigleway+pairway;

    }
    public static void main(String[] args) {
        System.out.println(Invite_Ways_Count(4));
        
    }
    
}
