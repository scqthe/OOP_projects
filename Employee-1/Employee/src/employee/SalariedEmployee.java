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
public class SalariedEmployee extends Employee

{
    
    private double salary;
    private double employeeEarnings;
    
    /// Constructor
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary)
    {
        
        super(firstName, lastName, socialSecurityNumber);
        
        if (salary <= 0.0)
            throw new IllegalArgumentException("Salary must be a positive value");
        
        this.salary = salary;
                    
    }
    
    /// Setter and getter
    
    public void setSalary(double newSalary)
    {
        if (newSalary <= 0.0)
            throw new IllegalArgumentException("Salary must be a positive value");
        
        this.salary = newSalary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    /// Override methods
    
    @Override
    public double earnings()
    {
        employeeEarnings = getSalary();
        return employeeEarnings;
    }
    
    @Override
    public void raise(double percent)
    {
        this.salary = this.salary * ((100 + percent) / 100);
    }
    
    @Override
    public String toString()
    {
        String output = String.format("Salaried " 
                + super.toString() 
                + "\n    Salary: %.2f" 
                + "\n    Earnings: $%.2f\n"
                , getSalary(), earnings());
        return output;
    }
    
}
