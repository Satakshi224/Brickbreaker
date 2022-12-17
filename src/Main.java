import javax.swing.*;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setSize(700,600);
        obj.setTitle("BrickBreaker");
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}