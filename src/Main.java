

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String decide;
    String firstName, lastName, residence;
    Integer  birthYear, dateNow;
    String juniorSchool, middleSchool, highSchool, university;
    public void profileApp () {
        System.out.println("===== PROFILE SYSTEM =====");
        System.out.println("1. Input Your Profile");
        System.out.println("2. Input Your Educational History");
        System.out.println("3. Profile Status");
        System.out.println("4. Education Status");
        System.out.println("5. Overall Profile");
        System.out.println("Input Here ===>");
        decide = scanner.nextLine();
    }



    public static void main(String[] args) {
        Main main = new Main();


        do {

            main.profileApp();


            switch (main.decide) {
                case "1":
                    System.out.println("\n");
                    System.out.println("Confirm Your Profile");
                    System.out.print("First Name: ");
                    main.firstName = main.scanner.nextLine();
                    System.out.print("Last Name: ");
                    main.lastName = main.scanner.nextLine();
                    System.out.print("Stay At: ");
                    main.residence = main.scanner.nextLine();
                    System.out.print("Birth Year: ");
                    main.birthYear = Integer.valueOf(main.scanner.nextLine());

                    break;

                case "2":
                    System.out.println("\n");
                    System.out.println("Confirm Your Educational History");
                    System.out.println("Junior School: ");
                    main.juniorSchool = main.scanner.nextLine();
                    System.out.println("Middle School: ");
                    main.middleSchool = main.scanner.nextLine();
                    System.out.println("High School: ");
                    main.highSchool = main.scanner.nextLine();
                    System.out.println("University: ");
                    main.university = main.scanner.nextLine();
                    break;

                case "3":
                    System.out.println("\n");
                    System.out.println("This Is Your Profile Record");
                    Profile profile = new Profile(main.firstName, main.lastName, main.residence, main.birthYear, main.dateNow);
                    profile.getProfile();
                    break;

                case "4":
                    System.out.println("\n");
                    System.out.println("This Is Your Education Record");
                    Education education = new Education(main.juniorSchool, main.middleSchool, main.highSchool, main.university);
                    education.getEducation();
                    break;

                case "5":
                    System.out.println("\n");
                    System.out.println("This Is All Your Information");
                    Profile profile2 = new Profile(main.firstName, main.lastName, main.residence, main.birthYear, main.dateNow);
                    profile2.getProfile();
                    Education education2 = new Education(main.juniorSchool, main.middleSchool, main.highSchool, main.university);
                    education2.getEducation();
                    break;

                default:
                    System.out.println("Unfortunately You Didnt Choose Anything");
                    break;
            }
            System.out.println("Are You Sure Want To Exit? (Y/N)");
            main.decide = main.scanner.nextLine();
        } while (main.decide.equalsIgnoreCase("N"));
        System.out.println(" MAKASIH BRADER UDAH MAMPIR HEHE :) ");
    }
}