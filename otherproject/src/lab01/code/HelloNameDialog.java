
import javax.swing.JOptionPane;

public class HelloNameDialog{
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("please enter your name:");
        JOptionPane.showConfirmDialog(null,"Hi"+ result + "!");
        System.exit(0);
    }
}