import javax.swing.JOptionPane;

public class Tabuada {
    public static void main (String args[]){
      
        int num;
        int contador = 1;
            
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite algum número para saber a tabuada entre 1 e 20"));
        while (contador <=10) {
            JOptionPane.showMessageDialog(null,"Resultado " + num + "*" + contador + "= " + num * contador);
               contador = contador +1;
               
               
      
            
            
            
            
            
            
            
        
           
            
            
          }    
    }
}
