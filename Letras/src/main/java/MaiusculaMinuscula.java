import javax.swing.JOptionPane;

public class MaiusculaMinuscula {
    public static void main (String args []){
        
        String letra = JOptionPane.showInputDialog(null,"Digite uma letra:");
        String letra2 = letra.toUpperCase();
        
            if (letra.equals(letra2)){
                JOptionPane.showMessageDialog(null,"Essa letra é MAIÚSCULA.");
            }else{
                JOptionPane.showMessageDialog(null,"Essa letra é MINÚSCULA.");
                
            }
            
                 
        



    
    
    
    }    
}