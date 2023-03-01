import java.util.*;
public class GopMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nA,nB,i,j;
        System.out.println("Nhập số phần tử cho 2 mảng: ");
        System.out.print("Mảng 1: ");
        nA= sc.nextInt();
        System.out.print("Mảng 2: ");
        nB= sc.nextInt();
        int A[]=new int[nA];
        int B[]=new int[nB];
        System.out.println("Mảng A:");
        for(i=0;i<nA;i++){
            System.out.print("Phần tử của mảng A tại vị trí "+i+": ");
            A[i]= sc.nextInt();
        }
        System.out.println("Mảng B:");
        for(i=0;i<nB;i++) {
            System.out.print("Phần tử của mảng B tại vị trí " + i + ": ");
            B[i] = sc.nextInt();
        }
        int C[]=new int[A.length+B.length];
        for(i=0;i<A.length;i++){
            C[i]=A[i];
        }
            for(j=0,i= A.length;j< B.length;j++,i++){
                C[i]=B[j];
            }
        System.out.println("Mảng khi được gộp mới sẽ là: ");
        for (int newArray: C
             ) {
            System.out.println(newArray);
            
        }
        }
        }



