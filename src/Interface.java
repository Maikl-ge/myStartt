import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {
    public Interface() {
        super("title");
        super.setBounds(200, 200, 300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 2, 5,5));
        JLabel name = new JLabel("Ваше имя");
        JTextField name_field = new JTextField(" ", 1);
        JLabel emale = new JLabel("Ваша почта");
        JTextField emale_field = new JTextField("@", 1);

        container.add(name);
        container.add(name_field);
        container.add(emale);
        container.add(emale_field);

        JButton send_batton = new JButton("Send");
        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 25);//Тут все про шрифт)
        send_batton.setFont(BigFontTR);//применяем шрифт к кнопке
        container.add(send_batton);
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.getWidth() );
        System.out.println(screenSize.getHeight());

    }
}