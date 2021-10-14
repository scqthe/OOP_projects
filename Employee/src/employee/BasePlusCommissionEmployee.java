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
public class BasePlusCommissionEmployee extends CommissionEmployee
        
{
    
    private double baseSalary;
    private double employeeEarnings;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be a positive value");
                    
        this.baseSalary = baseSalary;
                
    }
    
    public void setBaseSalary(double newBaseSalary)
    {
        if (newBaseSalary < 0.0)
            throw new IllegalArgumentException("New base salary must be a positive value");
        
        this.baseSalary = newBaseSalary;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    @Override
    public double earnings()
    {
        employeeEarnings = getBaseSalary() + super.earnings();
        return employeeEarnings;
    }
    
    @Override
    public String toString()
    {
        String output = String.format("Base Salary Plus Commissioned Employee: " 
                + "%s %s with ssn: %s" 
                + "\n    Gross Sales: %.2f" 
                + "\n    Commission Rate: %.2f"
                + "\n    with Base Salary of: $%.2f"
                + "\n    Earnings: $%.2f\n"
                , getFirstName(), getLastName(), getSSN(), getGrossSales(), getCommissionRate(), getBaseSalary(), earnings());
        return output;
    }
    
    
}
