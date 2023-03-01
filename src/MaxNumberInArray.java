import java.util.*;
public class MaxNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int element;
        int []elementArray;
        do{
            System.out.print("Nhập số Lượng giá trị:");
            element= sc.nextInt();
            if(element>20) {
                System.out.println("Số giá trị không vượt quá 20!");
            }
        } while (element>20);
        elementArray = new int[element];
        int i = 0;
        while (i < elementArray.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            elementArray[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < elementArray.length; j++) {
            System.out.print(elementArray[j] + "\t");
        }int max = elementArray[0];
        int index = 1;
        for (int j = 0; j < elementArray.length; j++) {
            if (elementArray[j] > max) {
                max = elementArray[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong số các phần tử là " + max + " ,ở vị trí số " + index);
    }
}
