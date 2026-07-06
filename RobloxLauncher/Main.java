package my_scripts.RobloxLauncher;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("ROADBLOCKS LAUNCHER");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null); // manual positioning, like before

        System.out.println("Looking in: " + new java.io.File("/my_scripts/RobloxLauncher/images/background.png").getAbsolutePath()); //debug line to check the path

        // Load the image and put it in a label
        ImageIcon backgroundImage = new ImageIcon("/my_scripts/RobloxLauncher/images/background.png"); // error on this line needs fixing -J
        System.out.println("Image width: " + backgroundImage.getIconWidth());
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 400, 300); // covers the entire window
        window.add(background);

        window.setVisible(true);
    }
}