# 🖥️ Tela de Login em Java (POO + Interfaces)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![Interfaces](https://img.shields.io/badge/Interfaces-OOP-green?style=for-the-badge)
![Swing](https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge)

---

## 📌 Sobre o projeto
Este é um exemplo simples de **Tela de Login em Java**, implementada com:
- **Programação Orientada a Objetos (POO)**  
- Uso de **Interfaces** para abstrair a autenticação  
- Biblioteca gráfica **Swing** para construção da interface  

O sistema demonstra conceitos importantes como:
- Encapsulamento  
- Implementação de interfaces  
- Separação de responsabilidades  

---

## 🏗️ Estrutura do Projeto
```bash

src/
├── Autenticavel.java # Interface de autenticação
├── LoginService.java # Classe que implementa a interface
└── TelaLogin.java # Tela gráfica com Swing
```

---

## 📖 Explicação do Código

### 🔹 `Autenticavel.java`
Define o contrato de autenticação, garantindo que qualquer classe que implemente essa interface possua o método `autenticar()`.

```java
public interface Autenticavel {
    boolean autenticar(String usuario, String senha);
}
```
### 🔹 `LoginService.java`

Classe que implementa a interface Autenticavel.
Aqui fica a lógica de validação do login (exemplo simples com usuário fixo).
```bash
public class LoginService implements Autenticavel {
    @Override
    public boolean autenticar(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }
}
```

### 🔹 `TelaLogin.java`

Tela construída em Swing, onde o usuário insere usuário e senha.
Ela usa a interface Autenticavel para validar as credenciais.

```bash
public class TelaLogin extends JFrame {
    // ...
    if (autenticador.autenticar(usuario, senha)) {
        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
    }
}
```
----
### `▶️ Como executar`

1. Compile os arquivos:
```bash
javac *.java
```
2. Rode o programa:
```bash
java TelaLogin
```
3. Credenciais padrão:
```bash
Usuário: admin

Senha: 1234
```

---
## 🎯 Conceitos aplicados

Interfaces: abstraem a autenticação, permitindo trocar a implementação no futuro (ex: validar com banco de dados).

POO: cada classe tem sua responsabilidade (Interface, Serviço, Tela).

Swing: construção de GUIs em Java.

## 🚀 Possíveis melhorias

Conectar a autenticação a um banco de dados.

Implementar hash de senha para maior segurança.

Usar MVC (Model-View-Controller) para separar ainda mais as responsabilidades.

#

![Dev Hudson](https://img.shields.io/badge/Dev-Hudson-blue?style=for-the-badge&logo=github)
