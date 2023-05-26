import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        Book book1 = new Book(29.99, 400, 5000, 100, "John Doe", "1234567890");
        Journal journal1 = null;
        try {
            journal1 = new Journal(9.99, 100, 2000, 50, "Jane Smith", "Monthly");
        } catch (NumberFormatException e) {
            System.out.println("Invalid frequency for Journal. Setting frequency to 'Unknown'.");
            journal1 = new Journal(9.99, 100, 2000, 50, "Jane Smith", "Unknown");
        }
        Magazine magazine1 = new Magazine(4.99, 50, 3000, 20, "Bob Johnson", "Weekly");

       
        System.out.println("Please choose a product to view:");
        System.out.println("1. Book");
        System.out.println("2. Journal");
        System.out.println("3. Magazine");
        int choice = scanner.nextInt();

        
        switch (choice) {
            case 1:
                book1.displayProductInformation();
                break;
            case 2:
                journal1.displayProductInformation();
                break;
            case 3:
                magazine1.displayProductInformation();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}

