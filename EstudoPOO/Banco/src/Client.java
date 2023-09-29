public class Client {
    private String name;
    private String cpf;

    private Account[] accounts = new Account[100];

    private int numberOfAccounts=0;

    public void addAccountC(Account conta){
        accounts[numberOfAccounts] = conta;
        numberOfAccounts++;
    }
    public void deleteAccountB(){

    }

    public void NewClient(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public void listAccounts(){
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}

