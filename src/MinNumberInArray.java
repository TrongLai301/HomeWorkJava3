import java.util.*;
public class MinNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print("Nhập độ dài mảng: ");
        n= sc.nextInt();
        int array[]=new int[n];
        for(i=0; i<n;i++){
            System.out.print("Phần tử của mảng tại vị trí "+i+": ");
            array[i]= sc.nextInt();
        }
        int min= array[0];
        for(i=1; i<n;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Phần tử bé nhất trong mảng là: "+min);
    }
}
