package model;

/**
 * Created by sonnyharsono on 5/20/17.
 */
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class Business {
    protected HashMap<String, NewHireBean> employees;

    protected HashMap<String, CustomerBean> customers;
    protected TreeMap<String, String> customerPhoneBook;

    public void Business() {
        employees = new HashMap<String, NewHireBean>();

        customers = new HashMap<String, CustomerBean>();
        customerPhoneBook = new TreeMap<String, String>();

    }

    public void addEmployee(NewHireBean anEmployee) {
        if (anEmployee != null
                && anEmployee.getLastName() != null
                && anEmployee.getFirstName() != null) {
            String key = anEmployee.getLastName() +
                    ", " + anEmployee.getFirstName();
            employees.put(key, anEmployee);
        }
        System.out.print("Finish");
    }

    public void addCustomer(CustomerBean aCustomer) {
        if (aCustomer != null && aCustomer.getLastName() != null &&
                aCustomer.getFirstName() != null) {
            String key = aCustomer.getLastName() +
                    ", " + aCustomer.getFirstName();
            customers.put(key, aCustomer);
        }
    }
    public NewHireBean getEmployee(String lastAndFirstName) {
        return employees.get(lastAndFirstName);
    }

    public String getCustomerPhoneNumber(String lastAndFirstName) {
        if(lastAndFirstName == null){
            return null;
        }
        return customerPhoneBook.get(lastAndFirstName);
    }

    public String getAllCustomerPhoneNumbers() {
        StringBuffer phoneNumberBuffer = new StringBuffer();
        TreeSet<String> sortedKeys = new TreeSet<String>(customerPhoneBook.keySet());
        for(String aKey : sortedKeys){
            String phoneNumber = customerPhoneBook.get(aKey);
            phoneNumberBuffer.append(aKey);
            phoneNumberBuffer.append(" - ");
            phoneNumberBuffer.append(phoneNumber);
            phoneNumberBuffer.append("; ");
        }
        return phoneNumberBuffer.toString();
    }

    public void addCustomerToPhoneBook(CustomerBean aCustomer) {
        if (aCustomer != null && aCustomer.getLastName() != null &&
                aCustomer.getFirstName() != null) {
            String key = aCustomer.getLastName() +
                    ", " + aCustomer.getFirstName();
            customerPhoneBook.put(key, aCustomer.getPhoneNumber());
        }
    }
}
