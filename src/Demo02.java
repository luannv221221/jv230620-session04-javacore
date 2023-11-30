import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];
        do {
            System.out.println("==========menu=========");
            System.out.println("1. Nhập vào mảng gồm 5 sinh viên");
            System.out.println("2. In ra danh sách sinh viên");
            System.out.println("3. Tính tổng sinh viên theo tên nhập vào");
            System.out.println("4. Thoat");
            System.out.println("Moi lua chon tu 1 - 3");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập vào họ tên sinh viên");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Họ tên sinh viên thứ "+(i+1));
                        students[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(students[i]);
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào tên sinh viên muốn kiểm tra");
                    String studentName = sc.nextLine();
                    int count = 0;
                    for (int i = 0; i < students.length; i++) {
                        if(students[i].equals(studentName)){
                            count ++;
                        }
                    }
                    System.out.printf("Số sinh viên có tên %s là %d\n",studentName,count);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai lua chon");
            }
        }while (true);

    }
}
