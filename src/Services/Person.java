package Services;

public class Person implements StudentRegistration {
    private String firstname;
    private String lastname;
    private String residence;


    public Person(String firstname, String lastname, String residence) {

    }


    public Person() {
        this.firstname = firstname;
        this.lastname = this.lastname;
        this.residence = this.residence;
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

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    @Override
    public void student(String firstname, String lastName, String residence) {

    }

    @Override
    public void fullName() {

    }

    @Override
    public void cardIdentitas() {

    }
}