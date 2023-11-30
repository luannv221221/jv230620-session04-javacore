import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao ho ten");
//        String fullName = sc.nextLine();
//        Pattern patternName = Pattern.compile("[a-zA-Z ]{3,30}");
//        Matcher check = patternName.matcher(fullName);
//        System.out.println(check.matches());

        // Hãy xây dựng REGEX Đông lào
        // 033951679|09010201201|0813902193021

        System.out.println("Nhập vào phone");
        String phone = sc.nextLine();
        Pattern patternPhone = Pattern.compile("(0[3|8|9])+([0-9]{8})");
        Matcher checkPhone = patternPhone.matcher(phone);
        System.out.println(checkPhone.matches());
        //^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$
    }
}
