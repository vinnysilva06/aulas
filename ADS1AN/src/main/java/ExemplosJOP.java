
import javax.swing.JOptionPane;


public class ExemplosJOP {
    public static void main(String[] args) {
        //Declaração de variáveis:
        int i;
        double d;
        boolean b;
        String s;
        
    
        s= JOptionPane.showInputDialog("Digite uma palavra");  //entrada de dados      
        JOptionPane.showMessageDialog(null,"a palavra digitada foi"+ s); //saida de dados
    
        i= Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro"));
        
        d= Double.parseDouble(JOptionPane.showInputDialog("digite um real"));
        
        b= Boolean.parseBoolean(JOptionPane.showInputDialog("digite true ou false"));
        
        JOptionPane.showMessageDialog(null,"valor inteiro digitado: " + i);
        JOptionPane.showMessageDialog(null,"Valor double: " + d);
        JOptionPane.showMessageDialog(null,"Verdade" + s);
        
        JOptionPane.showMessageDialog(null, "palavra:" + s + "\ninteiro: " + i 
        + "\ndouble:"  + d + "\nboolean" + b);
    }
    }
