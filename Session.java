class Session {
    String[] users = new String[10];
    Bank[] banks = new Bank[10];
    int userCount = 0;

    void addUser(String name){
        if(userCount >= 10){
            System.out.println("User limit reached.");
            return;
        }
        this.users[userCount] = name;
            Bank userBank = new Bank(String.valueOf(userCount));
            this.banks[userCount] = userBank;
            userBank.setBalance(0);
            getUser(userCount);
            userCount += 1;
    }

    void getUser(int uid){
        if(userCount == 0){
            System.out.println("No users found.");
        }
        System.out.println("Username: "+users[uid]);
        System.out.println("Balance: "+banks[uid].getBalance());
    }

    void addMoney(int uid, double count){
        if(userCount == 0){
            System.out.println("No users found.");
        }
        banks[uid].addMoney(count);
    }

    void removeMoney(int uid, double count){
        if(userCount == 0){
            System.out.println("No users found.");
        }
        banks[uid].removeMoney(count);
    }
}
