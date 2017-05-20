package model;

/**
 * Created by sonnyharsono on 5/20/17.
 */
import java.io.Serializable;

public class NewHireBean implements Serializable {

    private String firstName; // New hire first name
    private String lastName; // New hire last name
    private int startYear; // the year of starting employment
    private double payRate; // the hourly pay rate

    // no parameter constructor
    public NewHireBean() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param startYear
     * @param payRate
     */

    // overloaded constructor
    public NewHireBean(String firstName, String lastName, int startYear, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.payRate = payRate;
    }

    /*
    * private fields with standard getters and setters
    */

    /**
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
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
        return lastName;
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
     * @return the startYear
     */
    public int getStartYear() {
        return startYear;
    }

    /**
     *
     * @param startYear the startYear to set
     */
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    /**
     *
     * @return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     *
     * @param payRate the payRate to set
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
