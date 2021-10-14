/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author AnandRajan
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double salary;
    private double hourlyWage;
    private double hoursWorked;
    /// instance double variable wage needed for hourly (wages per hour)
    
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSSN()
    {
        return socialSecurityNumber;
    }
    
    @Override
    public String toString()
    {
        return ("Employee: " + getFirstName() + ' ' + getLastName() + " with ssn: " + getSSN());
    }
    

    /**
     * @param args the command line arguments
     */
    
}
