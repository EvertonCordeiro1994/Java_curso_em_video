import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
     
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        

        System.out.println("Largura da tela: " + screenSize.width);
        System.out.println("Altura da tela: " + screenSize.height);
    }
}