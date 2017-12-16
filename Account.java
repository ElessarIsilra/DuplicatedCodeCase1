package case1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Account {

    private double balance;
    private Date lastTransactionDate;
    private ArrayList<Transaction> transactionList;

    public Account() {
        this.balance = 0;
        this.lastTransactionDate = null;
        this.transactionList = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void mix(int id,double amount){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        lastTransactionDate = date;
        if(id==0){
            balance = balance - amount;
            transactionList.add(new Transaction(date, -amount));
        }else{
            balance = balance + amount;
            transactionList.add(new Transaction(date, amount));
        }
    }
    public void credit(double amount) {
        mix(0,amount);
    }

    public void debit(double amount) {
        mix(1,amount);
    }



}
