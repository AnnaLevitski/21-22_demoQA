package models;

public class StudentDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String dateOfBitht;
    private String subgects;
    private String hobbies;
    private String currentAddress;
    private String state;
    private String city;

    public StudentDTO(String firstName, String lastName, String email, String gender, String mobile, String dateOfBitht, String subgects, String hobbies, String currentAddress, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBitht = dateOfBitht;
        this.subgects = subgects;
        this.hobbies = hobbies;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDateOfBitht(String dateOfBitht) {
        this.dateOfBitht = dateOfBitht;
    }

    public void setSubgects(String subgects) {
        this.subgects = subgects;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDateOfBitht() {
        return dateOfBitht;
    }

    public String getSubgects() {
        return subgects;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
