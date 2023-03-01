import java.util.*;
public class Clearelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,c;
        do{
            System.out.print("Nhập số phần tử của mảng: ");
            n= sc.nextInt();
        }while(n<=0);
        int A[]= new int[n];
        System.out.println("Nhập các phần tử vào mảng: ");
        for(i=0;i<n;i++){
            System.out.print("phần tử tại vị trí "+i+": ");
            A[i]= sc.nextInt();
        }
        System.out.print("Nhập phần tử cần xóa: ");
        int k= sc.nextInt();
        for(i=c=0;i<n;i++){
            if(A[i]!=k){
                A[c]=A[i];
                c++;
            }
        }
        n=c;
        System.out.println("Số phần tử khi xóa đi phần tử "+k+" là: ");
        for(i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}

