import java.util.Scanner;

public class ChangeData {
    private Scanner scanner;

    public ChangeData() {
        this.scanner = new Scanner(System.in);
    }

    public void changeName(PatientData patient) {
        System.out.print("Gebe den neuen Namen ein: ");
        String newName = scanner.nextLine();
        patient.setName(newName);
    }
    public void changeBirthdate(PatientData patient) {
        System.out.print("Gebe das neue Geburtsdatum ein: ");
        String newBirthdate = scanner.nextLine();
        patient.setBirthDate(newBirthdate);
    }
    public void changeAdress(PatientData patient) {
        System.out.print("Gebe die neue Adresse ein: ");
        String newAdress = scanner.nextLine();
        patient.setAdress(newAdress);
    }
    public void changeEmail(PatientData patient) {
        System.out.print("Gebe die neue E-Mail Adresse ein:");
        String newEmail = scanner.nextLine();
        patient.setEmail(newEmail);
    }
    public void changePhonenumber(PatientData patient) {
        System.out.print("Gebe die neue Telefonummer ein: ");
        String newPhonenumber = scanner.nextLine();
        patient.setPhoneNumber(newPhonenumber);
    }

    public void modifyData(PatientData patient) {

        boolean weiter = true;

        while(weiter) {
            System.out.println();
            System.out.println("Möchtest du Änderungen vornhemen? (ja/nein)");
            String änderung = scanner.nextLine();

            if (änderung.equalsIgnoreCase("nein")) {
                weiter = false;
            } else {
                System.out.println("Welche Daten möchtest du ändern?");
                System.out.println("1 Name");
                System.out.println("2 Geburstag");
                System.out.println("3 Adresse");
                System.out.println("4 E-Mail");
                System.out.println("5 Telefonnummer");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        changeName(patient);
                        break;
                    case 2:
                        changeBirthdate(patient);
                        break;
                    case 3:
                        changeAdress(patient);
                        break;
                    case 4:
                        changeEmail(patient);
                        break;
                    case 5:
                        changePhonenumber(patient);
                        break;
                    default:
                        System.out.println("Fehler: Bitte gebe eine Zahl zwischen 1 und 5 ein!");
                        break;
                }
            }
        }
    }
}

