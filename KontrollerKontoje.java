import javax.swing.*;
import java.awt.*;
public class KontrollerKontoje
{ 
   private static KontojaBankare accountA = new KontojaBankare(0);
   private static KontojaBankare accountB = new KontojaBankare(0);
   private static KontojaBankare accountC = new KontojaBankare(0);

   public static void main(String[] args)
   {
      String b = JOptionPane.showInputDialog("Jeni konsumatori A, B apo C").toUpperCase(); // C - Bankieri;
      String k = "A";
      String z = "B";
      String y = "C";
      if(b.equals(k))
      {
         JOptionPane.showMessageDialog(null, "Mireserdhet konsumatori A");
         String mesazh1 = JOptionPane.showInputDialog("Nese deshironi te depononi prekni D, terheqni T, te ndalni N").toUpperCase();
         String d="D";
         String t="T";
         String n="N";
         
         if(mesazh1.equals(d))
         {
            String amont1 = JOptionPane.showInputDialog("Sa doni te depononi");
            Integer amount1 = new Integer(amont1).intValue();
            accountA.deposit(amount1);
         
         }else 
          if(mesazh1.equals(t))
         {String amont2 = JOptionPane.showInputDialog("Sa doni te terhiqni");
            Integer amount2 = new Integer(amont2).intValue();
            accountA.withdraw(amount2);
            int balance = accountA.getBalance();
      
         
}
         else {System.out.println("Faleminderit");
         System.exit(0);}
         int balance = accountA.getBalance();
      
         System.out.println("Balansi i A: " + balance+" euro");
         
      }
      if(b.equals(z))
      {
         JOptionPane.showMessageDialog(null, "Mireserdhet konsumatori B");
         String mesazh2 = JOptionPane.showInputDialog("Nese deshironi te depononi prekni D, terheqni T, te ndalni N").toUpperCase();
         String d="D";
         String t="T";
         String n="N";
         if(mesazh2.equals(d))
         {String amont1 = JOptionPane.showInputDialog("Sa doni te depononi");
            Integer amount1 = new Integer(amont1).intValue();
            accountB.deposit(amount1);
         }
         else if (mesazh2.equals(t))
         {String amont2 = JOptionPane.showInputDialog("Sa doni te terhiqni");
            Integer amount2 = new Integer(amont2).intValue();
            accountB.withdraw(amount2);}
         else {System.out.println("Faleminderit");
         System.exit(0);}
         int balance = accountB.getBalance();
         System.out.println("Balansi B: " + balance+" euro");
      }
      if(b.equals(y))
      { b = JOptionPane.showInputDialog("Bankieri don te caset A'se apo B'se").toUpperCase(); // C - Bankieri;
         k = "A";
         z = "B";
         if(b.equals(k))
         {
            String mesazh1 = JOptionPane.showInputDialog("Nese deshironi te depononi prekni D, terheqni T, te ndalni N").toUpperCase();
            String d="D";
            String t="T";
            String n="N";
            if(mesazh1.equals(d))
            {
               String amont1 = JOptionPane.showInputDialog("Sa doni te depononi");
               Integer amount1 = new Integer(amont1).intValue();
               accountA.deposit(amount1);
            }
            else if(mesazh1.equals(t))
            {String amont2 = JOptionPane.showInputDialog("Sa doni te terhiqni");
               Integer amount2 = new Integer(amont2).intValue();
               accountA.withdraw(amount2);}
            else {System.out.println("Faleminderit");
            System.exit(0);};
            int balance = accountA.getBalance();
            System.out.println("Balansi i A: " + balance+" euro");
         }
         if(b.equals(z))
         {String mesazh2 = JOptionPane.showInputDialog("Nese deshironi te depononi prekni D, terheqni T, te ndalni N").toUpperCase();
            String d="D";
            String t="T";
            String n="N";
            if(mesazh2.equals(d))
            {String amont1 = JOptionPane.showInputDialog("Sa doni te depononi");
               Integer amount1 = new Integer(amont1).intValue();
               accountB.deposit(amount1);
            }
            else if (mesazh2.equals(t))
            {String amont2 = JOptionPane.showInputDialog("Sa doni te terhiqni");
               Integer amount2 = new Integer(amont2).intValue();
               accountB.withdraw(amount2);}
            else {System.out.println("Faleminderit");
            System.exit(0);}
            int balance = accountB.getBalance();
            System.out.println("Balansi B: " + balance+" euro");
         }
      }

      main(new String[0]);
   }}