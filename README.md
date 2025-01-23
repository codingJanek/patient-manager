# Patient Management System

This is a simple Java console application that allows you to manage patient data. The program allows you to add new patients, view a list of patients, modify patient data, and delete patients from the system.

## Features

- **Add a new patient**: Enter patient details such as name, birthdate, address, email, and phone number.
- **View all patients**: Display a list of all patients.
- **Modify patient data**: Update any patient's details like name, birthdate, address, email, or phone number.
- **Delete a patient**: Remove a patient from the list based on their name.

## How to Run the Program

### Prerequisites

Make sure you have Java installed on your machine (minimum version 8).

You can use any text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) to run the program.

### Steps to Run

1. Copy the provided code into files with appropriate names:

    - `PatientData.java` (for storing patient details)
    - `ChangeData.java` (for modifying patient data)
    - `UserEingabe.java` (for input and creation of new patients)
    - `PatientList.java` (for managing the list of patients)
    - `PatientenVerwaltung.java` (for the main management logic)
    - `PatientManager.java` (for starting the program)

2. Open a terminal or command prompt.
3. Navigate to the directory containing the Java files.
4. Compile the program using:

    ```
    javac *.java
    ```

5. Run the program with:

    ```
    java PatientManager
    ```

## Example Usage

---Patientenverwaltung---

1. Neuen Patienten anlegen
2. Patientenliste anzeigen
3. Patientendaten ändern
4. Patienten löschen
5. Programm beenden

Auswahl: 1 

Gebe die Patienten Daten ein 
Name: John Doe 

Geburtstag: 01.01.1980 

Adresse: 1234 Elm Street 

E-Mail: john.doe@example.com 

Telefonnummer: 1234567890

Patient hinzugefügt John Doe

---Patientenverwaltung---

Neuen Patienten anlegen
1. Patientenliste anzeigen
2. Patientendaten ändern
3. Patienten löschen
4. Programm beenden 

Auswahl: 2

Liste aller Patienten: 

Name: John Doe 

Geburtstag: 01.01.1980 

Adresse: 1234 Elm Street 

E-Mail: john.doe@example.com

Telefonnummer: 1234567890


## Notes

- The program allows you to interactively manage patient data in a simple way.
- Input validation is not implemented, so make sure to enter the correct data types when prompted.

## Possible Improvements

- Add input validation to prevent errors when entering patient data.
- Implement a search function to find patients by other criteria, such as email or phone number.
- Add an option to export the patient data to a file.

Enjoy using the Patient Management System!
