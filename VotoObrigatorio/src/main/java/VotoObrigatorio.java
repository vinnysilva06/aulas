import javax.swing.JOptionPane;

public class VotoObrigatorio {
    public static void main (String[] args){
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, digite sua idade"));
               if (idade >= 18){
                  
                   if (idade >= 70){
                       JOptionPane.showMessageDialog(null,"Voto NÃO obrigatório");
                   } else{
                       JOptionPane.showMessageDialog(null, "Voto obrigatório ");
                   }
                   
                }else{
                   JOptionPane.showMessageDialog(null, "Voto NÃO obrigatório");
               
                    
                }
                
                        

               
                  
    }    

}