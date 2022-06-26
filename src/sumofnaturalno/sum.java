package sumofnaturalno;

public class sum {
    String bankName;
    String accountHolderName;
    double balance;
    int accountNumber;

    public static void main(String[] args) {
        int a=10;
        int sum1=a*(a+1)/2;
        //System.out.println(sum1);
        sum obj1=new sum();
        obj1.bankName="SBI";
        obj1.accountHolderName="Abhay Prakash";
        obj1.accountNumber= 1234567889;

        System.out.println(obj1.accountHolderName);
        System.out.println(obj1.accountNumber);
        System.out.println(obj1.bankName);

    }
}
