import java.util.Scanner;

public class UserEingabe {
    private Scanner scanner;

    public UserEingabe() {
        this.scanner = new Scanner(System.in);
    }

    public PatientData createPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die Patienten Daten ein");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Geburtstag: ");
        String birthDate = scanner.nextLine();

        System.out.print("Adresse: ");
        String adress = scanner.nextLine();

        System.out.print("E-Mail: ");
        String email = scanner.nextLine();

        System.out.print("Telefonnummer: ");
        String phoneNumber = scanner.nextLine();
        System.out.println();

        PatientData patient = new PatientData(name, birthDate, adress, email, phoneNumber);

        System.out.println("Patient hinzugefügt" + patient.getName());
        return patient;
    }
}
