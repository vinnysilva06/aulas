import javax.swing.JOptionPane;


public class Quadrado {
    public static void main (String args[]){
        int lado;
        int contador = 1;
        
            lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado do seu quadrado:"));
            while (contador <= lado * lado){
            
                if (contador / lado == 0)
                 JOptionPane.showMessageDialog(null, "*\n");
                
                else
               JOptionPane.showMessageDialog(null, "*");
                        
            contador ++;
            
            }
        
        
    }
}
