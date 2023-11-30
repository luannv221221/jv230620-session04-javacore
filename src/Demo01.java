import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // khai báo biến chuỗi
//        String fullName = "Nguyen Van A";
//
//        fullName = "Nguyen Thi A";
//        String address = "Hà Nội";
//        // một số phương thức để thao tác với chuỗi
//        System.out.println("Chuỗi vừa khai báo là "+fullName);
//        System.out.println("Số lượngkysys tu trong chuoi là "+fullName.length());
//        System.out.println(fullName.charAt(2));
//
//        String fullNameAddress = fullName.concat(address);
//
//        System.out.println(fullNameAddress);
//        System.out.println(fullName + address);
//
//        fullName = "nguyen";
//        System.out.println("Chuyen thanh Hoa "+fullName.toUpperCase());
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap vao ho ten");
//        fullName = sc.nextLine();
//        System.out.println(fullName.trim());

//        String s1 = "B11";
//        String s2 = "b11";

//        if(s1.equals(s2)){
//            System.out.println("Chuoi giong nhau");
//        } else {
//            System.out.println("CHui khac nhau");
//        }
//
//        if(s1.equalsIgnoreCase(s2)){
//            System.out.println("chuoi giong nhau khong phan biet hoa thuong");
//        } else {
//            System.out.println("chuoi khong giong nhau khong phan biet hoa thuong");
//        }

        String s1 = "Nguyen Van A";
        String s2 = "Nguyen Van";

        System.out.println(s1.compareTo(s2));
        // chuyen ve ky tu thuong
        s1 = s1.toLowerCase();
        if(s1.contains("Nguyen")){
            System.out.println("co");
        } else {
            System.out.println("ko");
        }
        // nguoi nhap vao ma sản phẩm mã sản phẩm phải bắt đầu bằng ký tự B
        Scanner scanner = new Scanner(System.in);
            String productCode;
           do {
               System.out.println("Nhập vào mã sản phẩm");
               productCode = scanner.nextLine();
           } while (!productCode.startsWith("B"));

           // viết chương trình có menu
           // ===========menu==============
           //1 Nhập vào mảng gồm tên của 5 sinh viên
            //2 hiển thị danh sách
            // 3 kiem tra xem danh sach co bao nhieu ban ten Nguyễn Văn A

    }
}
