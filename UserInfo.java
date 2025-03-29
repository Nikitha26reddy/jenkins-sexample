import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String rollNumber = scanner.nextLine();
        String departmentName = scanner.nextLine();
        System.out.println("\nUser Information:");
        System.out.println("Username: " + username);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + departmentName);
        scanner.close();
    }
}

