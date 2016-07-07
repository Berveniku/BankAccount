import java.awt.*;
import javax.swing.*;
import java.text.*;
public class KontojaBankare extends JPanel
{
private int balance; 
public KontojaBankare(int amount)
{ if ( amount >= 0 )
{ balance = amount; }
else { balance = 0; }
}
public boolean deposit(int amount1)
{ boolean result = false;
if ( amount1 < 0 )
{ JOptionPane.showMessageDialog(null,
"Gabim: depositi " + amount1);
}
else { balance = balance + amount1;
result = true;
}
return result;
}

public boolean withdraw(int amount2)
{ boolean result = false;
if ( amount2 < 0 )
{ JOptionPane.showMessageDialog(null,
"Gabim: terheqja " + amount2);
}
else if ( amount2 > balance )
{ JOptionPane.showMessageDialog(null,
"Gabim: terheqja tejkalon balansin");
}
else { balance = balance - amount2;
result = true;
}
return result;
}


public int getBalance()
{ return balance; }

public class BankReader
{ private String inputLine;


public BankReader()
{ inputLine = ""; }

public char readCommand(String message)
{ inputLine = JOptionPane.showInputDialog(message).trim().toUpperCase();
return inputLine.charAt(0);
}

public int readAmount()
{ int answer = 0;
String s = inputLine.substring(1, inputLine.length());
s = s.trim();
if ( s.length() > 0)
{ double money = new Double(s).doubleValue();
answer = (int)(money * 100);
}
else { JOptionPane.showMessageDialog(null,
"Gabim: transakcion pa vlere");
}
return answer;
}
}}