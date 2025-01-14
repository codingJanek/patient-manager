import java.util.ArrayList;

public class PatientData {
    private String name;
    private String birthDate;
    private String adress;
    private String email;
    private String phoneNumber;

    public PatientData(String name, String birthDate, String adress, String email, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.email = email;

        this.phoneNumber = phoneNumber;
    }
    //GETTER METHODEN
    public String getName() {
        return name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getAdress() {
        return adress;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //SETTER METHODEN
    public void setName(String newName) {
        this.name = newName;
    }
    public void setBirthDate(String newBirthdate) {
        this.birthDate = newBirthdate;
    }
    public void setAdress(String newAdress) {
        this.adress = newAdress;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public void setPhoneNumber(String newPhonenumber) {
        this.phoneNumber = newPhonenumber;
    }

    public String toString() {
        return "Name: " + name + " Geburtstag: " + birthDate + " Adresse: " + adress + " E-Mail: " + email + " Telefonnummer: " + phoneNumber + '\'';
    }


    //Patienten Daten Anzeigen lassen
    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Geburtstag: " + birthDate);
        System.out.println("Adresse: " + adress);
        System.out.println("E-Mail: " + email);
        System.out.println("Telefonnummer: " + phoneNumber);
    }
}
