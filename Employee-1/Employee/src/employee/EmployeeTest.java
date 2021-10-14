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
public class EmployeeTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("Employee information.");
    CommissionEmployee employee1 = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
    BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .05, 300);
    SalariedEmployee employee3 = new SalariedEmployee("Sha", "Yang", "333-33-3333", 1150.0);
    HourlyEmployee employee4 = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
    HourlyEmployee employee5 = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);
    System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);
    
    System.out.println();
    System.out.println();

    System.out.println("Employee information after raises.");
    Employee[] employeeArray;
    employeeArray = new Employee[5];
    
    employeeArray[0] = employee1;
    employeeArray[1] = employee2;
    employeeArray[2] = employee3;
    employeeArray[3] = employee4;
    employeeArray[4] = employee5;
    
    for (Employee person: employeeArray) {
        
        if (person instanceof SalariedEmployee)
        {
            person.raise(4);
        }
        
        else
        {
            person.raise(2);
        }
        
        System.out.print(person);
    
    }
    
   


    }
    
    
}
