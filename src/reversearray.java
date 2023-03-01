import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        int[] num =new int[size];
        int i=0;
        while (i < num.length){
            System.out.print("enter element "+(i+1)+": ");
            num[i]=sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + "\t");
        }
        for (int j = 0; j < num.length / 2; j++) {
            int temp = num[j];
            num[j] = num[size - 1 - j];
            num[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + "\t");
        }
    }
}