

public class Education extends Profile {
    private String juniorSchool;
    private String middleSchool;
    private String highSchool;
    private String university;
//

    public Education(String juniorSchool, String middleSchool, String highSchool, String university) {
        this.juniorSchool = juniorSchool;
        this.middleSchool = middleSchool;
        this.highSchool = highSchool;
        this.university = university;
    }


    public void setJuniorSchool (String juniorSchool) {
        this.juniorSchool = juniorSchool;
    }
    public void setMiddleSchool (String middleSchool) {
        this.middleSchool = middleSchool;
    }
    public void setHighSchool (String highSchool) {
        this.highSchool = highSchool;
    }
    public void setUniversity (String University) {
        this.university = university;
    }

    public String getJuniorSchool() {
        return this.juniorSchool;
    }
    public String getMiddleSchool() {
        return this.middleSchool;
    }
    public String getHighSchool() {
        return this.highSchool;
    }
    public String getUniversity() {
        return this.university;
    }

    public void getEducation() {
        System.out.println("\n");
        System.out.println("===== Education =====");
        System.out.println("Junior School: " + this.juniorSchool);
        System.out.println("Middle School: " + this.middleSchool);
        System.out.println("High School: " + this.highSchool);
        System.out.println("University: " + this.university);
    }

}
