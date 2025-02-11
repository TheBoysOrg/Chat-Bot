package telas;

import br.edu.uteis.CriaResposta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaDeMensagens extends JFrame {
    private String resposta;
    private JTextArea messageArea;
    private JTextField textField;
    private RoundedButton sendButton;

    public TelaDeMensagens() {
        setTitle("FutChat");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);
        
        ImageIcon icon = new ImageIcon("images/cr72.jng");
        setIconImage(icon.getImage());

        RoundedPanel imageBackgroundPanel = new RoundedPanel(40, true);
        imageBackgroundPanel.setLayout(new BorderLayout());
        setContentPane(imageBackgroundPanel);

        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        messageArea.setOpaque(false);
        messageArea.setForeground(Color.WHITE);
        messageArea.setFont(new Font("Serif", Font.PLAIN, 16));
        messageArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(messageArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        imageBackgroundPanel.add(scrollPane, BorderLayout.CENTER);

        RoundedPanel inputPanel = new RoundedPanel(30, false);
        inputPanel.setLayout(new BorderLayout(10, 10));
        inputPanel.setOpaque(false);
        inputPanel.setBackground(new Color(50, 54, 58, 220));

        textField = new JTextField();
        textField.setFont(new Font("Serif", Font.PLAIN, 16));
        textField.setForeground(Color.WHITE);
        textField.setCaretColor(Color.WHITE);
        textField.setOpaque(false);
        textField.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        textField.setPreferredSize(new Dimension(300, 40));
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });
        inputPanel.add(textField, BorderLayout.CENTER);

        sendButton = new RoundedButton("Enviar", 20);
        sendButton.setBackground(new Color(60, 63, 65));
        sendButton.setForeground(Color.WHITE);
        sendButton.setFont(new Font("Serif", Font.BOLD, 16));
        sendButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sendButton.addActionListener(e -> sendMessage());
        inputPanel.add(sendButton, BorderLayout.EAST);

        imageBackgroundPanel.add(inputPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void sendMessage() {
        String message = textField.getText().trim();
        if (!message.isEmpty()) {
            messageArea.append("Você: " + message + "\n");
            textField.setText("");
            SwingUtilities.invokeLater(() -> messageArea.setCaretPosition(messageArea.getDocument().getLength()));
            resposta = CriaResposta.responde(message);
            messageArea.append("Chat: " + resposta + "\n");
            textField.setText("");
            SwingUtilities.invokeLater(() -> messageArea.setCaretPosition(messageArea.getDocument().getLength()));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelaDeMensagens::new);
    }
}
