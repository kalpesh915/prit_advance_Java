package com.mycompany.jdbcproject1;

interface CreditCard{
    public String makePayment(double amount);
}

interface DebitCard{
    public String makePayment(double amount);
}

interface UPI{
    public String makePayment(double amount);
}

public class Paper6 {
    public static void main(String[] args) {
        CreditCard creditCard = (amount) -> "Payment "+amount+" Received via Credit Card";
        DebitCard debitCard = (amount) -> "Payment "+amount+" Received via Debit Card";
        UPI upi = (amount) -> "Payment "+amount+" Received via UPI";
        
        System.out.println(creditCard.makePayment(15000));
        
    }
}
