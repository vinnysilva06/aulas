
import javax.swing.JOptionPane;

//Ler as notas de 5 alunos e mostrar a média de cada um deles
public class ProjetoTeste {
    public static void main(String[] args) {
        
        int contador = 1;// controle do laço
        double nota1 , nota2;
        while (contador <= 5){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota"));
            JOptionPane.showMessageDialog(null, (nota1 + nota2 /2));
            contador = contador + 1;
    
    }

    
  
    }
    
}
