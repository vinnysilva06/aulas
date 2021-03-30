import javax.swing.JOptionPane;

public class Exemplo {
    public static void main (String args []){
        
        String input =  JOptionPane.showInputDialog("Digite uma palavra: ");
        
        JOptionPane.showMessageDialog(null, input.charAt(0) );
        
        
        //if (Character.isUpperCase(input.charAt(0))){
        //    JOptionPane.showMessageDialog(null,"Letra Maiúscula");
        //}else{
        //    JOptionPane.showMessageDialog(null,"Letra minúscula");
        }
         
    }