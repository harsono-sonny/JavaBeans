package model;

/**
 * Created by sonnyharsono on 5/20/17.
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.ArrayList;


public class PersonBean implements Serializable {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public int age;

    public PersonBean() {

    }
    /**
     *
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param age
     */

    /**
     *
     * @return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return the lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     *
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonBean)) return false;

        PersonBean that = (PersonBean) o;

        if (getAge() != that.getAge()) return false;
        if (!getFirstName().equals(that.getFirstName())) return false;
        if (!getLastName().equals(that.getLastName())) return false;
        return getPhoneNumber().equals(that.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getPhoneNumber().hashCode();
        result = 31 * result + getAge();
        return result;
    }

    //this bean has an OPTIONAL constructor that sets all the values


    public PersonBean(String firstName,String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


    public static void main (String[]args){


        PersonBean sonnyPerson = new PersonBean("Sonny", "Harsono", 26);

        sonnyPerson.setFirstName("Sonny");
        sonnyPerson.setLastName("Harsono");
        sonnyPerson.setAge(26);

        PersonBean victoriaPerson = new PersonBean();

        victoriaPerson.setFirstName("Victoria");
        victoriaPerson.setLastName("Fisher");
        victoriaPerson.setAge(20);

        HashMap<String, PersonBean> companyMap;
        companyMap = new HashMap<>();

        companyMap.put("vicePresident", victoriaPerson);
        companyMap.put("president", sonnyPerson);

        ArrayList<PersonBean> companyList;
        companyList = new ArrayList<>();

        companyList.add(sonnyPerson);
        companyList.add(victoriaPerson);

    }

}

