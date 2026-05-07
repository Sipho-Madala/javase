package madala.learning.oop.masterclassone.demo;

import madala.learning.oop.masterclassone.model.BankAccount;

public class BankAccountDemo {
        public static void main(String[] args) {
            
             BankAccount bankAccount = new BankAccount();
             bankAccount.setAccountNumber("123456789");
             bankAccount.setCustomerName("John Doe");
             bankAccount.setEmail("Johndoe@gmail.com");
             
             bankAccount.withdrawal(150.00);
             bankAccount.deposit(150.00);
             bankAccount.withdrawal(100.00);
        }
}
