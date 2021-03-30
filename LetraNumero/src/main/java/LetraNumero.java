import javax.swing.JOptionPane;

public class LetraNumero {
    public static void main (String[] args){

        String letra = JOptionPane.showInputDialog(null, "Digite uma letra ou um número");
        char t = letra.charAt(0);
        
            if (Character.isLetter(t)){
                JOptionPane.showMessageDialog(null, t + " é uma letra.");
            }else if (Character.isDigit(t)){
                JOptionPane.showMessageDialog(null,t + " é um número");
            }












    }     

}
