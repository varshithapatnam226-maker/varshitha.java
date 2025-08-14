public class College {
    private String collegeName;
    private String collegeLocation;
    public College(String collegeName, String collegeLocation) {
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
    }
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }

    public void setCollegeLocation(String collegeLocation) {
        this.collegeLocation = collegeLocation;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + collegeLocation);
    }
}
