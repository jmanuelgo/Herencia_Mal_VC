import javax.swing.JOptionPane;
public class principal {
    public static void main (String args[]){
        App p = new App();
        int nu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Nro."));
        p.cdigi(nu);

}  
}
