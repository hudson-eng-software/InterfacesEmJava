import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    private Autenticavel autenticador;

    public TelaLogin(Autenticavel autenticador) {
        this.autenticador = autenticador;

        setTitle("Tela de Login");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new GridLayout(3, 2, 10, 10));

        // Componentes
        JLabel lblUsuario = new JLabel("Usuário:");
        JLabel lblSenha = new JLabel("Senha:");
        txtUsuario = new JTextField();
        txtSenha = new JPasswordField();
        btnEntrar = new JButton("Entrar");

        // Adiciona na tela
        add(lblUsuario);
        add(txtUsuario);
        add(lblSenha);
        add(txtSenha);
        add(new JLabel()); // espaço vazio
        add(btnEntrar);

        // Ação do botão
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());

                if (autenticador.autenticar(usuario, senha)) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        });
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Autenticavel loginService = new LoginService();
            TelaLogin tela = new TelaLogin(loginService);
            tela.setVisible(true);
        });
    }
}

