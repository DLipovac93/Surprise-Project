import java.awt.*;
import javax.swing.*;

public class Surprise extends JPanel {

    int boardWidth = 360;
    int boardHeight = 640;

    // Image
    Image backgroundImg;

    Surprise() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.green);
        
        // Here you can change the image selection
        backgroundImg = new ImageIcon(getClass().getResource("./noPeaking1.png")).getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        System.out.println("Fuck you");
        
        // Background drawing
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);

    }

}   

