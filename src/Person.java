public class Person {
    private String firstName;
    private String familyName;
    public Person(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){ //for what use?
        this.firstName = firstName;
    }
    public String getFamilyName(){
        return familyName;
    }
    public void setFamilyName (String familyName){ //for what use?
        this.familyName = familyName;
    }
    public boolean equals (Person person){ //for what use?
        if(this.firstName.equals(person.getFirstName()) && this.familyName.equals(person.getFamilyName())){
            return true;
        } else {
            return false;
        }
    }
}
