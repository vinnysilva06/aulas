import javax.swing.JOptionPane;
public class exemplo7 {
    
public static void main(String[] args) {
int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
String podeDirigir;
if (idade >= 18)
podeDirigir = "Sim, você pode dirigir";
else
podeDirigir = "Não, você não pode dirigir por enquanto";
JOptionPane.showMessageDialog(null, podeDirigir);
}
}








}
