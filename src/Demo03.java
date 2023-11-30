public class Demo03 {
    public static void main(String[] args) {
        StringBuilder fullName = new StringBuilder();

        StringBuilder address = new StringBuilder("Hà Nội");

        address.append("-Ba Đình");
        System.out.println(address);

        fullName.append("Nguyen");
        fullName.insert(0,"Van ");
        // Van Nguyen
        fullName.insert(fullName.length()," A");
        System.out.println(fullName);
        // Van Nguyen A
        fullName.delete(11,12);
        System.out.println(fullName);

        fullName.reverse();
        System.out.println(fullName);

        String demo = fullName.toString();
        demo = "Nguyen Văn A";
    }
}
