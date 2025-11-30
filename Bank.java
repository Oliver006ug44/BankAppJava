public class Bank {
    private double balance = 0;
    public String UID;

    Bank(String uid){
        this.UID = uid;
    }


    void setBalance(double newBalance){
        this.balance = newBalance;
    }

    void addMoney(double count){
        balance += count;
    }

    void removeMoney(double count){
        if(count > balance){
            System.out.println("Not enough money in this account.");
        }
    }

    double getBalance(){
        return balance;
    }
}

