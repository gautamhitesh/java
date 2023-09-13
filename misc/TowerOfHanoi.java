package misc;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh('A', 'C', 'B', 4);
    }

    public static void toh(char source, char destination, char aux, int disks){
        if(disks==0){
           return;
        }
        toh(source, aux, destination, disks-1);
        System.out.println("Move disk "+ disks+ " from "+source+ " to "+ destination);
        toh(aux,destination,source,disks-1);
    }
}
