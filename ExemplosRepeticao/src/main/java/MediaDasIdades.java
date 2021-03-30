import javax.swing.JOptionPane;

public class MediaDasIdades {
    public static void main (String args[]) {
        int idade1, idade2, idade3;
        int contador = 3;
       
            while (contador >= 0) {
               idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
               idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
               idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
               JOptionPane.showMessageDialog(null,"Média das idades é " + ( idade1 + idade2 + idade3/3));
               contador = contador -1;
           
            
            
            
            
            
            
            
            
            
           }
          
    
    
    }
  
    
}
