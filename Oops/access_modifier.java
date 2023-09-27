public class access_modifier {

  public static void main(String args[]) {
    BankAccount swapnilBankAccount = new BankAccount();
    swapnilBankAccount.userName = "SwampGT";
    swapnilBankAccount.setMoneyAmount(123);
    // System.out.println(swapnilBankAccount);
  }
}

class BankAccount {

  public String userName;
  private int passCode;
  private int moneyAmount;

  void setPassCode(int newPassCode) {
    passCode = newPassCode;
  }

  void setMoneyAmount(int newMoneyAmount) {
    moneyAmount = newMoneyAmount;
  }
}
