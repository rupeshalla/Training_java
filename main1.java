import java.util.Scanner;
public class main1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i < size; i++){
            array[i] =scan.nextInt();
        }
    }
}