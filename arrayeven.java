import java.util.Scanner;
public class arrayeven {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        int count1=0,count2=0;
        for(int i=0;i<size;i++){
            if(array[i]==0) count1++;
            if(array[i]==1) count2++;
            
     }
     System.out.println("No of 0s:"+count1);
            System.out.println("No of 1s:"+count2);
    }
}

    