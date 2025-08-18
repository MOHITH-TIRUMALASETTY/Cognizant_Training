abstract public class Account {
    int a = 20;
    void withdraw(){
        System.out.println("inside show");
    }
    abstract void deposit();
    abstract void checkBAlance();
   
}

class SavingsAccount extends_Account{
    @Override
    void deposit(){

    }


}

class AbstractClass{
    public static void main(String[] args) {
        
    }
}