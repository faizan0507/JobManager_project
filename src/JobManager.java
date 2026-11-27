import java.util.Scanner;
public class JobManager {
    static Scanner input = new Scanner(System.in);
    static String[] titles = new String[100];
    static String[] descriptions = new String[100];
    static String[] dates = new String[100];
    static String[] statuses = new String[100];
    static int jobCount = 0;

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("\nEnter your choice: ");
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
    static String askForText(String message) {
        String text="";
        while(text.isEmpty()){
            System.out.print(message);
            text=input.nextLine().trim();
            if(text.isEmpty()){
                System.out.println("This cannot be empty.Please try again.");
            }

        }
        return text;
    }
    static void storeJob(String title,String description,String date,String status){
        titles[jobCount]=title;
        descriptions[jobCount]=description;
        dates[jobCount]=date;
        statuses[jobCount]=status;
        jobCount++;
    }


    static void addJob() {
        if(jobCount>=titles.length){
            System.out.println("Sorry,the job list is full!");
            return;
        }
        System.out.println("\n==== ADD NEW JOB ====");
        String title=askForText("Enter job title: ");
        String description = askForText("Enter job description: ");
        String date = askForText("Enter job date(e.g 25-11-2026): ");
        storeJob(title,description,date,"Pending");

        System.out.println("\nJob added successfully!");
        System.out.println("Title: " + title);
        System.out.println("Status: Pending");

    }

    }
    static void viewJobs() {}
    static void searchJob() {}
    static void updateJob() {System.out.println("afeera");}
    static void deleteJob() {
        System.out.println("Mursaleen");
    }
    static void jobSummary() {}

}