import javax.swing.JOptionPane;

public class MinusculaMaiuscula {
    public static void main (String args []){
        float a;
        float A;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite a letra 'a' "));
        A = Float.parseFloat(JOptionPane.showInputDialog("Digite a letra 'A' "));
        
        if (a == a){
            JOptionPane.showMessageDialog(null,"Letra minúscula");
        }else{
            JOptionPane.showMessageDialog(null,"Letra Maiúscula");
        }
                 
        



    
    
    
    }    
}