



public class Profile {
    private String firstName;
    private String lastName;
    private String residence;
    private Integer birthYear;



    public Profile(String firstName, String lastName, String residence, Integer birthYear, Integer dateNow) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.residence = residence;
        this.birthYear = birthYear;
    }

    public Profile() {
    }
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNameName(String lastName) {
        this.lastName = lastName;
    }

    public void setResidence(String Residence) {
        this.residence = residence;
    }



    public Integer getBirthYear() {
        return this.birthYear;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getResidence() {
        return this.residence;
    }



    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public Integer getAge() {
        return 2022 - this.birthYear;
    }

    public void getProfile() {
        System.out.println("\n");
        System.out.println("===== Profile =====");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Stay At: " + this.residence);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Full Name: " + getFullName());
        System.out.println("Your Age: " + getAge());
    }


}
