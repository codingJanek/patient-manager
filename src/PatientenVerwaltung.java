import java.util.Scanner;

public class PatientenVerwaltung {
    private PatientList patientList;
    private UserEingabe userEingabe;
    private ChangeData changeData;
    private Scanner scanner;

    public PatientenVerwaltung() {
        this.patientList = new PatientList();
        this.userEingabe = new UserEingabe();
        this.changeData = new ChangeData();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean weiter = true;

        while (weiter) {
            System.out.println("\n---Patientenverwaltung---");
            System.out.println("1. Neuen Patienten anlegen");
            System.out.println("2. Patientenliste anzeigen");
            System.out.println("3. Patientendaten ändern");
            System.out.println("4. Patienten löschen");
            System.out.println("5. Pogramm beenden");
            System.out.print("Auswahl: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    neuerPatientEintragen();
                    break;
                case 2:
                    patientenListeAnezigen();
                    break;
                case 3:
                    patientenDatenÄndern();
                    break;
                case 4:
                    patientenLöschen();
                    break;
                case 5:
                    weiter = false;
                    System.out.println("Programm beendet");
                    break;
                default:
                    System.out.println("Fehler: Ungültige Eingabe!");
            }
        }
    }

    private void neuerPatientEintragen() {
        PatientData patient = userEingabe.createPatient();
        patientList.addPatient(patient);
    }

    private void patientenListeAnezigen() {
        patientList.showAllPatients();
    }

    private void patientenDatenÄndern() {
        System.out.print("Geben die den Namen des Patienten ein, dessen Daten sie ändern möcheten: ");
        String name = scanner.nextLine();
        PatientData patient = patientList.findPatientByName(name);
        if (patient != null) {
            changeData.modifyData(patient);
        } else {
            System.out.println("Fehler: Patient mit dem Namen \"" + name + "\" wurde nicht gefunden");
        }
    }

    public void patientenLöschen() {
        System.out.println("Geben sie den Namen des Patienten ein, den sie löschen möchten: ");
        String name = scanner.nextLine();
        PatientData patient = patientList.deletePatient(name);
        if (patient != null) {
            System.out.println("Patient " + name + " wurde gelöscht!");
        } else {
            System.out.println("Fehler: Patient mit dem Namen " + name + " wurde nicht gefunden!");
        }
    }
}

