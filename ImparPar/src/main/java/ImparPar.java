import javax.swing.JOptionPane;

public class ImparPar {
    public static void main (String [] args){
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digíte qualquer número"));
        
            if (num % 2 == 0){
                JOptionPane.showMessageDialog(null, "Esse número é par.");
            
            }else{
                JOptionPane.showMessageDialog(null, "Esse número é ímpar.");
            }
        
        



   
    
    
    }     
}
