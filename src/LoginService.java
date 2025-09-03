
    public class LoginService implements Autenticavel {

        @Override
        public boolean autenticar(String usuario, String senha) {
            // Exemplo simples: valida usuário e senha fixos
            return usuario.equals("admin") && senha.equals("1234");
        }
    }


