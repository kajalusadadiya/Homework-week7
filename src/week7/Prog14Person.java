package week7;

public class Prog14Person {
    String firstname;
    String lastname;
    int age;

    public static void main(String[] args) {
        Prog14Person person = new Prog14Person();
        person.setFirstName(" ");
        person.setLastname(" ");
        person.setAge(10);
        System.out.println("full name =" + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen" + person.isTeen());
        person.setLastname("John ");
        System.out.println("fullName" + person.getFullName());

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public int getAge() {

        return age;
    }

    public void setFirstName(String firstName) { //no return with one parameter
        this.firstname = firstName;


    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    // no return with one parameter

    public void setAge(int age) {

        if (age < 0 && age > 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }


    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            return true;
        } else {

            return false;
        }
    }

    public String getFullName() {
        if (firstname.isEmpty()) {

            return firstname;
        } else if (lastname.isEmpty()) {
            return lastname;
        } else if (firstname.isEmpty() && lastname.isEmpty()) {
            return " ";
        } else {
            return "=" + firstname + " " + lastname;
        }
    }


}

