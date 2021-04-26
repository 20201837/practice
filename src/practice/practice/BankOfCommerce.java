package practice;

public class BankOfCommerce extends Bank {
    double year;

    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        int day = (int) (r * 1000);
        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.00011 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n",
                savedMoney, super.year, day, interest);
        return interest;
    }

    public static void main(String args[]) {
        int amount = 8000;
        BankOfCommerce  bank3 = new BankOfCommerce ();
        bank3.savedMoney = amount;
        bank3.year = 8.236;
        bank3.setInterestRate(0.035);
        double interest1 = bank3.computerInterest();
    }
}