package gui.main;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class StartButtonExample implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new StartButtonExample());
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(createMainPanel(), BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel createMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        Dimension panelSize = new Dimension(400, 400);
        panel.setPreferredSize(panelSize);

        JButton button = new JButton("Start");
        Dimension buttonSize = button.getPreferredSize();

        int height = panelSize.height - buttonSize.height;
        int width = panelSize.width - buttonSize.width;
        int top = height * 3 / 4;
        int left = (width - buttonSize.width) / 2;
        int bottom = height / 4;
        int right = left;
        panel.setBorder(BorderFactory.createEmptyBorder(
                top, left, bottom, right));

        panel.add(button, BorderLayout.CENTER);

        return panel;
    }

}