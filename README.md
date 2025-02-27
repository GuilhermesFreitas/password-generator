# Password Generator

This is a Java password generator that creates random passwords with different security levels. The user can choose the security level, the password length, and even get a security tip with a randomly generated word.

## Features
- Password generation with varying levels of complexity:
  - **Basic**: Only letters (uppercase and lowercase).
  - **Medium**: Letters and numbers.
  - **Strong**: Letters, numbers, and special characters.
- Password length customizable (between 8 and 50 characters).
- Security tip: includes a randomly generated word suggestion to enhance password security.

## How to use

### Prerequisites
- Java 8 or higher installed.

### Steps to run the code

1. Clone the repository:
   ```bash
   git clone https://github.com/GuilhermesFreitas/password-generator.git


2.Navigate to the project folder:

```cd password-generator```

3.Compile the code:

```javac Main.java```

4.Run the code:

    java Main

Example execution:
```
------- Gerador de Senhas -------
Nível de segurança: Básica(1), Média(2), Forte(3)
Digite o nível de segurança da senha: 3
Quantos caracteres? (entre 8 e 50): 12
Sua senha foi gerada: r5@Hj6m*2k9
Dica: Antes de salvar a senha em um gerenciador de senhas, adicione uma palavra aleatória ao final da senha. Uma palavra aleatória foi gerada caso queira usar: adventure
