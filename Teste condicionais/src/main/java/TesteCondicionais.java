
import javax.swing.JOptionPane;


public class TesteCondicionais {
    public static void main(String args[]){
        //Declaração de variaveis
        float nota;
        float frequencia;
        
        //Entrada de dados
        nota = Float.parseFloat(JOptionPane.showInputDialog("Por favor,informe sua nota"));
        frequencia = Float.parseFloat(JOptionPane.showInputDialog("Por favor,informe sua frenquencia"));
        
        if (nota >= 50.0){
            if (frequencia >= 85.0) {
                JOptionPane.showMessageDialog(null, "Aluno aprovado");
            }else {
                JOptionPane.showMessageDialog(null,"Aluno reprovado por ausencia" );
            }
        }else { 
            JOptionPane.showMessageDialog(null, "Aluno reprovado por nota");
            
            
            
            
               
                       
                
                }
                 
        
        }
    }
    

