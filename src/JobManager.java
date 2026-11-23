import java.util.Scanner;
public class JobManager {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();

            switch(choice) {

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
    static void addJob() {}
    static void viewJobs() {}
    static void searchJob() {}
    static void updateJob() {}
    static void deleteJob() {}
    static void jobSummary() {}

}