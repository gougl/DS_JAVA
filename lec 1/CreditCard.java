public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // constructor with non-arg
    public CreditCard(){};
    // constructor with args
    public CreditCard(String customer, String bank, String account, int limit, double balance){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public String getCustomer(){
        return this.customer;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccount(){
        return this.account;
    }
    public String getBank(){
        return this.bank;
    }

    public void makePayment(double amount){
        if (balance - amount < 0)
            System.out.println("No money");
        else
            balance = balance - amount;
    }

}
