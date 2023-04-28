import javax.swing.*;
import java.awt.*;
import java.beans.Visibility;

class CustomFrame extends JFrame {
    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public CustomFrame () {
        setTitle("Нижнє праве вікно");
        requestFocus();
        setSize(600, 700);
        setLocation(dimension.width-this.getSize().width, dimension.height-this.getSize().height);
        setVisible(true);
    }

}
public class Main {

    public static void newFrame () {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Нижнє праве вікно");
        jFrame.requestFocus();
        jFrame.setSize(600, 700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width-jFrame.getSize().width, dim.height-jFrame.getSize().height);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new CustomFrame();
        newFrame();
    }


}