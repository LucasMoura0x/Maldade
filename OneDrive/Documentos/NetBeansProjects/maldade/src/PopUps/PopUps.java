package PopUps;

import javax.swing.*;
import java.awt.*;

public class PopUps extends JFrame {

    // Variável estática que guarda a instância da janela (opcional)

    private static PopUps instancia;

    private Image imagem;

    public PopUps() {
        setTitle("Imagem como Background");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Carregar a imagem ANTES de criar o painel
        ImageIcon icon = new ImageIcon(getClass().getResource("/resource/ricardo_milos.png"));
        imagem = icon.getImage();

        // Criar um JPanel personalizado que desenha a imagem
        JPanel painel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            }
        };

        add(painel);
        setVisible(true);
        setAlwaysOnTop(true);
        toFront();
        requestFocus();
    }

    public PopUps(String ricardo_milospng) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
