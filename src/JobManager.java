import java.util.Scanner;
public class JobManager {

    static Scanner input = new Scanner(System.in);
    static final int MAX = 100;
    static int jobCount = 0;
    static String[] status = new String[MAX];
    static String[] jobTitles = new String[MAX];

    // All these static Scanner object, variables
    // and arrays was declared outside main function
    // Any of the member does not need to declare and create these variables
    // again in every function. These are global scoped variables and arrays
    // means you can use everywhere in a JobManager class without declaring again
    // in every function including main and other six user-defined functions.

    public static void main (String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("\nEnter your choice from the given menu: ");
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
        System.out.println("Komal");
    }
    static void viewJobs() {
        System.out.println("Nobody");
    }
    static void searchJob() {
        System.out.println("Hafsa");
    }
    static void updateJob() {
        System.out.println("afeera");
    }
    static void deleteJob() {
        System.out.println("Mursaleen");
    }
    static void jobSummary() {
        System.out.println("Mursaleen");
    }

}