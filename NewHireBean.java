package model;

/**
 * Created by sonnyharsono on 5/20/17.
 */
public class NewHireBean extends PersonBean {

    private String id;

    public NewHireBean(String firstName, String lastName, int age, String phoneNumber, String id) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }
}
