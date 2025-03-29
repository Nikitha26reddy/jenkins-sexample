import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter your department name: ");
        String departmentName = scanner.nextLine();
        System.out.println("\nUser Information:");
        System.out.println("Username: " + username);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + departmentName);
        scanner.close();
    }
}

