import javax.swing.JOptionPane;
public class calculadora {
    public static void main(String[] args) {
        
       String firstNumber =
         JOptionPane.showInputDialog("Enter First Integer");
       String secondNumber = 
         JOptionPane.showInputDialog("Enter Second Integer");

         int number1 = Integer.parseInt( firstNumber );
         int number2 = Integer.parseInt( secondNumber );


         int sum = number1 + number2;
         JOptionPane.showMessageDialog(null, "resultado:" + sum, "calculadora", JOptionPane.PLAIN_MESSAGE);

    }
}
