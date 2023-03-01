import java.util.*;
public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Nhập số phần tử cho mảng: ");
        n= sc.nextInt();
        int [] newArray= new int[n];
        System.out.println("Nhập phần tử vào mảng:");
        for(int i=0;i<n;i++){
            newArray[i]= sc.nextInt();
        }
        int index=minValue(newArray);
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+newArray[index]);
    }
    public static int minValue(int[] newArray){
        int index =0;
        for(int i=0;i<newArray.length;i++){
            if(newArray[i]<newArray[0]){
                index=i;
            }
        }
        return index;
    }
}
