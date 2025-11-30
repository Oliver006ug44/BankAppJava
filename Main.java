import java.util.*;
public class Main{
    public static void main(String[] args) {
        boolean running = true;
        Session mySes = new Session();

        while (running) {
            String userInput;
            System.out.println("Enter a command: ");
            Scanner s = new Scanner(System.in);
            userInput = s.next();
            int uid;

            if(userInput.equals("addUser")){
                System.err.println("Enter username: ");
                userInput = s.next();
                try{
                    mySes.addUser(userInput);
                    System.out.println("User added successfully!");
                    continue;
                }
                catch (Exception err){
                    System.err.println("An error Occured: " + err);
                }
            }
            if(userInput.equals("getUser")){
                System.out.println("Enter UID: ");
                uid = s.nextInt();
                mySes.getUser(uid);
                continue;
            }
            if(userInput.equals("addMoney")){
                System.out.println("Enter UID: ");
                uid = s.nextInt();
                System.out.println("Enter amount: ");
                double count = s.nextDouble();
                mySes.addMoney(uid, count);
                continue;
            }
            if(userInput.equals("removeMoney")){
                System.out.println("Enter UID: ");
                uid = s.nextInt();
                System.out.println("Enter amount: ");
                double count = s.nextDouble();
                mySes.removeMoney(uid, count);
                continue;
            }
            if (userInput.equals("quit")) {
                System.out.println("Exiting...");
                running = false;
            }
            else{
                System.err.println("Invalid command! \n");
                continue;
            }

            s.close();
        }
    }
}