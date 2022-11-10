package Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    static String decide;
    String firstname, lastname, residence, Matakuliah;
    int sks, totalsks;


    public static void main(String[] args) {
        Main main = new Main();
        StudentRegistration studentRegistration;
        Scanner scanner = new Scanner(System.in);

        StudentRegistration sr;
        List<StudentRegistration> studentRegistrationList = new ArrayList<>();

        boolean isNext = true;
        while (isNext) {
            System.out.println("====SIAKAD CERITANYA NIH EHEHE====");
            System.out.println("1. Profile");
            System.out.println("2. Akademik");
            System.out.println("3. Detail Mahasiswa");
            System.out.print("Input disini mas/mba : ");
            decide = scanner.nextLine();


            switch (decide) {
                case "1":
                    System.out.println("====Profile====");
                    System.out.println("Masukan Nama depan: ");
                    main.firstname = main.scanner.nextLine();
                    System.out.println("Masukan Nama Belakang: ");
                    main.lastname = main.scanner.nextLine();
                    System.out.println("Masukan Domisili Anda: ");
                    main.residence = main.scanner.nextLine();
                    sr = new Person();
                    studentRegistrationList.add(sr);
                    break;
                case "2":
                    System.out.println("====Akademik====");
                    System.out.println("Masukan SKS: ");
                    main.sks = main.scanner.nextInt();
                    System.out.println("Masukan Total SKS sebelumnya:");
                    main.totalsks = main.scanner.nextInt();
                    sr = new Students(main.sks, main.Matakuliah, main.totalsks);
                    studentRegistrationList.add(sr);
                    break;
                case "3":
                    System.out.println("Detail Mahasiswa" );
                    System.out.println("Nama Anda: " + main.firstname + " " + main.lastname);
                    System.out.println("Domisili Anda: " + main.residence);
                    System.out.println("SKS Yg diambil: " + main.sks);
                    System.out.println("Total SKS sebelumnya: " + main.totalsks);
                    System.out.println("Total SKS semester  ini: " + (main.totalsks + main.sks));
                    break;

                default:
                    System.out.println("DIH MASA GA MILIH:(");
                    break;
            }

            System.out.println("Are You Sure Want To Exit? (Y/N)");
            main.decide = main.scanner.nextLine();

        }
    }
}