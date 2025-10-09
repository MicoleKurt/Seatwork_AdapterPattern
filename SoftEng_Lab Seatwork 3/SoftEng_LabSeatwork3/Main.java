package SoftEng_LabSeatwork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("==========================================");
        System.out.println(" Gonda, Micole Kurt T.");
        System.out.println(" Lab Seatwork 3");
        System.out.println("==========================================");
        System.out.println("   Unified School Management Application  ");
        System.out.println("==========================================");

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        while (running) {
            System.out.println("\nSelect a system to manage:");
            System.out.println("1. Attendance System");
            System.out.println("2. Grading System");
            System.out.println("3. Library System");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    attendanceAdapter.integrateSystem();
                    break;
                case 2:
                    gradingAdapter.integrateSystem();
                    break;
                case 3:
                    libraryAdapter.integrateSystem();
                    break;
                case 4:
                    System.out.println("Exiting the School Management Application...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        input.close();
        System.out.println("Thank you for using the School Management Application!");
    }
}
