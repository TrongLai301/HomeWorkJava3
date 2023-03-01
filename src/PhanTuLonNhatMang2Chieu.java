import java.util.*;
public class PhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soDong,soCot,i,j;
        System.out.print("Nhập số dòng: ");
        soDong= sc.nextInt();
        System.out.print("Nhập số cột: ");
        soCot= sc.nextInt();
        int [][]Array= new int[soDong][soCot];
        for(i=0;i<soDong;i++){
            for(j=0;j<soCot;j++){
                System.out.println("phần tử tại dòng "+i+" cột "+j+": ");
                Array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (i = 0; i < soDong; i++) {
            for (j = 0; j < soCot; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        int max= Array[0][0];
        for (i = 0; i < soDong; i++) {
            for (j = 0; j < soCot; j++) {
                if(Array[i][j]>max){
                    max=Array[i][j];
                }
            }
            }System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: "+max);
    }
}
