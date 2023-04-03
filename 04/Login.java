import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (
            // username == "admin" &&
            // password == "password123"
            username.equalsIgnoreCase("admin") &&
            password.equals("password123")
        ) {
            System.out.println("Login sukses.");
        } else {
            System.out.println("Login gagal. Username/password salah.");
        }
    }
}
