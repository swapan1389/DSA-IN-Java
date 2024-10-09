/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3; // number of disks
        CalTowerOfHanoi(n, "S", "H", "D");
    }
    public static void CalTowerOfHanoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Move disk "+ n+" from source "+src+" to destination "+dest);
            return;
        }
        CalTowerOfHanoi(n-1, src, dest, help);
        System.out.println("Move disk "+n+" from source "+src+" to destination "+dest);
        CalTowerOfHanoi(n-1, help, src, dest);
    }
}