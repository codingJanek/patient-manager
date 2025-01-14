import java.util.ArrayList;

public class PatientList {
    private ArrayList<PatientData> patientList;

    public PatientList() {
        this.patientList = new ArrayList<>();
    }

    public PatientList(ArrayList<PatientData> patientList) {
        this.patientList = new ArrayList<>();
    }

    public void addPatient(PatientData patient) {
        patientList.add(patient);
        System.out.println("Patient wurde hinzugefügt: " + patient.getName());

    }

    public PatientData deletePatient(String name) {
        for (PatientData patient : patientList) {
            if (patient.getName().equalsIgnoreCase(name)) {
                patientList.remove(patient);
                return patient;
            }

        }
        return null;
    }

    public PatientData findPatientByName(String name) {
        for (PatientData patient : patientList) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }
    public void showAllPatients() {
        System.out.println("\nListe aller Patienten: ");
        for (PatientData patient : patientList) {
            System.out.println(patient);
        }
    }
}

