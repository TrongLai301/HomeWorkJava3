import java.util.*;
public class PushElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,k;
        do{
            System.out.println("Nhập só phần tử của mảng: ");
            n= sc.nextInt();
        }while(n<=0);
        int A[]=new int[n];
        System.out.println("Nhập các phần tử vào mảng:");
        for(i=0;i<n;i++){
            System.out.print("Phần tử tại vị trí "+i+": ");
            A[i]= sc.nextInt();
        }
        do{
        System.out.print("Nhập vị trí muốn thêm phần tử: ");
        k= sc.nextInt();
        }while(k<=-1 || k>=A.length);

        System.out.print("Nhập phần tử muốn thêm: ");
        int z= sc.nextInt();
        System.out.println("Phần tử sau khi được sắp xếp lại là: ");
        n++;

        int newA[]=new int[n];
        for(i=0;i<k;i++){
            newA[i]=A[i];
            newA[k]=z;
            System.out.println(newA[i]);
        }System.out.println(newA[k]);
        for(i=k+1;i<n;i++){
            newA[i]=A[i-1];
            System.out.println(newA[i]);
        }
    }
}
