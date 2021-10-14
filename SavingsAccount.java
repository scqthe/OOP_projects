/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

/**
 *
 * @author AnandRajan
 */
public class SavingsAccount 
{
    static double annualInterestRate = 10.0;
    
    double savingsBalance;
    
    public SavingsAccount(double newBalance)
    {
        this.savingsBalance = newBalance;
    }
    
    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate/100.0) * (1.0/12.0);
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }
    
    public static void setInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
    
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        SavingsAccount.setInterestRate(4.0);

        System.out.println("Savings Account Balances");
        System.out.printf("%-16s%-24s%-24s\n", "Month", "Saver1", "Saver2");
        
        for (int counter = 1; counter < 13; counter++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%-16s%-24s%-24s\n", counter, String.format("%.2f",saver1.getSavingsBalance()), String.format("%.2f", saver2.getSavingsBalance()));
        }
        
        SavingsAccount.setInterestRate(5.0);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.printf("%-16s%-24s%-24s\n", "13", String.format("%.2f",saver1.getSavingsBalance()), String.format("%.2f", saver2.getSavingsBalance()));

    }
    
}
