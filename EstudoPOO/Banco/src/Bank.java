public class Bank {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    private Account[] accounts = new Account[100];

    private int contador =0;
    public void addAccountB(Account conta){
        accounts[contador] = conta;
        contador++;
    }
    public void listAccounts(){
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public void listAccounts(long agency){
        for (Account account : accounts) {
            if (account.getAgency() == agency) {
                System.out.println(account);
            }
        }
    }
    public void deleteAccountB(int index){

    }
    public double approveLimit(double amount,int accountTime){
        if(amount<= (accountTime*300)){
    return amount;
        }
        return (accountTime*300);
    }

}
