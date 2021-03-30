
import javax.swing.JOptionPane;

public class VidaPessoa {
    public static void main (String args []){

        int anos,resultado;
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        resultado = (anos * 365);
        JOptionPane.showMessageDialog(null,"Sua idade em dias é:" + resultado);
   
    
    
    }
}
