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
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
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
    
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    
    public String getSSN()
    {
        return socialSecurityNumber;
    }
    
    public void setSSN(String newSocialSecurityNumber)
    {
        this.socialSecurityNumber = newSocialSecurityNumber;
    }
        
    public abstract void raise(double percent);
    
    public abstract double earnings();
    
    @Override
    public String toString()
    {
        return ("Employee: " + getFirstName() + ' ' + getLastName() + " with ssn: " + getSSN());
    }
    

    /**
     * @param args the command line arguments
     */
    
}
