public class BuilderPattern {

    public static void main(String[] args) {
//        Build the person Detail in step by step approach. 
        PersonDetails personDetail = (new BuildDetails()).setfName("John").setlName("Son").setAge(20).getPersonDetails();
        System.out.println(personDetail.toString());
    }
    
}

//Person Detail class
class PersonDetails {
    String fName;
    String lName;
    String fatherName;
    String motherName;
    int age;
    String address;
    String education;
//    other variables

    @Override
    public String toString() {
        return "PersonDetails:\n" + "\tFirst Name=" + fName + "\n\tLast Name=" + lName + "\n\tFatherName=" + fatherName + "\n\tMotherName=" + motherName + "\n\tAge=" + age + "\n\tAddress=" + address + "\n\tEducation=" + education;
    }   
    
}

//build the person object in step by step  
class BuildDetails {
    private PersonDetails personDetails;
    
    BuildDetails() {
        this.personDetails = new PersonDetails();
    }
    
    public BuildDetails setfName(String fName) {
        this.personDetails.fName = fName;
        return this;
    }

    public BuildDetails setlName(String lName) {
        this.personDetails.lName = lName;
        return this;

    }

    public BuildDetails setAge(int age) {
        this.personDetails.age = age;
        return this;
    }

    public BuildDetails setAddress(String address) {
        this.personDetails.address = address;
        return this;
    }

    public BuildDetails setEducation(String education) {
        this.personDetails.education = education;
        return this;
    }
// other variables setting methods
    
    public PersonDetails getPersonDetails() {
        return personDetails;
    }
    
}
