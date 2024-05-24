package view;
import service.CourseService;
import service.CourseServiceImp;

import java.util.InputMismatchException;
import java.util.Scanner;
public class View {
    private final static CourseService courseService = new CourseServiceImp();
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("============================");
            System.out.println("1. Add new Courses");
            System.out.println("2. List Courses ");
            System.out.println("3. Find Course By ID ");
            System.out.println("4. Find Course By Title ");
            System.out.println("5. Remove Course By ID");
            System.out.println("0/99. Exit");
            System.out.println("============================");
            System.out.print("[+] Insert option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        courseService.addNewCourse();
                        break;
                    case 2:
                        courseService.listAllCourses();
                        break;
                    case 3:
                        courseService.findCourseById();
                        break;
                    case 4:
                        courseService.findCourseByTitle();
                        break;
                    case 5:
                        courseService.removeCourseById();
                        break;
                    case 0:
                    case 99:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please choice option between 1 and 5.");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input! Please choice option from 1-5.");
                scanner.next();
            }

        }
    }
}

