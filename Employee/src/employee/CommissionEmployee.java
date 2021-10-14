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
public class CommissionEmployee extends Employee 

{
    
    private double grossSales;
    private double commissionRate;
    private double employeeEarnings;
   
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be a positive number");
        
        if (commissionRate <= 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission Rate must be a number between 0 and 1");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setCommissionRate(double newCommissionRate)
    {
        if (newCommissionRate <= 0.0 || newCommissionRate > 1.0)
            throw new IllegalArgumentException("Commission Rate must be a number between 0 and 1");
        
        this.commissionRate = newCommissionRate;
    }
    
    public void setGrossSales(double newGrossSales)
    {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be a positive number");
        
        this.grossSales = newGrossSales;
    }
    
    public double earnings()
    {
        employeeEarnings = getCommissionRate() * getGrossSales();
        return employeeEarnings;
    }   
  
    @Override
    public String toString()
    {
        String output = String.format("Commissioned " 
                + super.toString() + "\n    Gross Sales: %.2f" 
                + "\n    Commission Rate: %.2f" 
                + "\n    Earnings: $%.2f\n"
                , getGrossSales(), getCommissionRate(), earnings());
        return output;
    }
    
}
