package medilabosolution.patientmanager.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Patient {
    private int id;
    @NotBlank(message = "firstname cannot be blank")
    private String firstname;
    @NotBlank(message = "lastname cannot be blank")
    private String lastname;
    @NotNull
    private boolean gender;
    @NotBlank(message = "birthdate cannot be blank")
    private String birthdate;
    private String phone;
    private String zipcode;
    public Patient(){

    }
    public int getId() {
        return id;
    }
    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}
