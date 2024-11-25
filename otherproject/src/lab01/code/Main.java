public class Main {
    public static void main(String[] args) {
      BankAccount a = new BankAccount("Mai Trung Hieu", "20225838", 100000);
      a.deposit(5000);
      a.withDraw(10000);
      a.print();
  
      System.out.println("-----------------");
      SavingAccount b = new SavingAccount("Mai Trung A", "987654321", 200000.0, 0.05);
      
      b.deposit(10000);
      b.withDraw(50000);
      System.out.println("tien sinh loi hang thang: " + b.CaculateMonthlyInterest());
      b.print();
      
    }
  }