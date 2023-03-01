import java.util.*;
public class FindLocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []nameStudy ={"Linh","Hưng","Tùng","Trí","Vinh","Huấn","Chung","Tuấn"};
        System.out.print("Enter name find: ");
        String find=sc.nextLine();
        boolean needfind= false;
        for(int i=0; i< nameStudy.length;i++){
            if(nameStudy[i].equals(find)){
                System.out.print("Sinh viên cần tìm là "+find+" đang nằm ở vị trí: "+(i+1));
                needfind=true;
                break;
            }
        }
        if(!needfind){
            System.out.print("Không thể tìm thấy sinh viên tên "+find+" trong danh sách sinh viên!!!");
        }
    }
}
