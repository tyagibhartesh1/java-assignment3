
import java.util.Scanner;

class UniversityLogin {
    void login(String username) {
        try {
            if (username == null) {
                throw new NullPointerException(
                        "Username cannot be null"
                );
            }

            System.out.println("Login Successful");
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class A3_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Convert the text "null" into an actual null value
        if (username.equals("null")) {
            username = null;
        }

        UniversityLogin u = new UniversityLogin();
        u.login(username);

        sc.close();
    }
}
