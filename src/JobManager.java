import java.util.Scanner;
public class JobManager {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int choice;
        do {
            showMenu();
            System.out.println("\nEnter your choice from the given menu: ");
            choice = Integer.parseInt(input.nextLine().trim());

            switch(choice) {
                case 1:
                    addJob();
                    break;
                case 2:
                    viewJobs();
                    break;
                case 3:
                    searchJob();
                    break;
                case 4:
                    updateJob();
                    break;
                case 5:
                    deleteJob();
                    break;
                case 6:
                    jobSummary();
                    break;
                case 0:
                    System.out.println("\nThank you for using our program :)");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        }while(choice != 0);
    }

    static void showMenu() {
        System.out.println("\n==== Job Manager ====\n");
        System.out.println("1. Add Job");
        System.out.println("2. View Jobs");
        System.out.println("3. Search Job");
        System.out.println("4. Update Job Status");
        System.out.println("5. Delete Job");
        System.out.println("6. Job Summary");
        System.out.println("0. Exit");
    }
    static void addJob() {
        System.out.println("hello");
        System.out.println("hello");
    }
    static void viewJobs() {}
    static void searchJob() {}
    static void updateJob() {System.out.println("afeera");}
    static void deleteJob() {
        System.out.println("Mursaleen");
    }
    static void jobSummary() {}

}