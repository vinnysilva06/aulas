
import javax.swing.JOptionPane;


public class Antecessor {
    public static void main (String args []){

    int i,resultado;    
    i = Integer.parseInt (JOptionPane.showInputDialog("Digite um número:"));
    resultado = (i - 1);
    JOptionPane.showMessageDialog(null,"O antecessor do número digitado é:" + resultado);
    
    
    }
        }
