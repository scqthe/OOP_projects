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
public class HourlyEmployee extends Employee

{
    
    private double hourlyWage;
    private double hoursWorked;
    private double employeeEarnings;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (hourlyWage <= 0.0)
            throw new IllegalArgumentException("Hourly Wage must be a positive value");
        
        if (hoursWorked < 1.0 || hoursWorked > 168.0)
            throw new IllegalArgumentException("Hours worked must be between 1 and 168");
                    
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    public void setHourlyWage(double newHourlyWage)
    {
        if (newHourlyWage <= 0.0)
            throw new IllegalArgumentException("New Hourly Wage must be a positive value");
        
        this.hourlyWage = newHourlyWage;
    }
    
    public void setHoursWorked(double newHoursWorked)
    {
        if (newHoursWorked < 1.0 || newHoursWorked > 168.0)
            throw new IllegalArgumentException("New Hours Worked must be between 1 and 168");
        
        this.hoursWorked = newHoursWorked;
    }
    
    public double getHourlyWage()
    {
        return hourlyWage;
    }
    
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    public double earnings()
    {
        if (getHoursWorked() > 40.0)
        {
            employeeEarnings = getHourlyWage()*(40 + (getHoursWorked() - 40)*1.5);
        }
        
        else
        {
            employeeEarnings = getHourlyWage() * getHoursWorked();
        }
        
        return employeeEarnings;
    }
    
    @Override
    public String toString()
    {
        String output = String.format("Hourly " 
                + super.toString() 
                + "\n    Hourly Wage: %.2f" 
                + "\n    Hours Worked: %.2f" 
                + "\n    Earnings: $%.2f\n"
                , getHourlyWage(), getHoursWorked(), earnings());
        return output;
    }
           
    
}
