import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialSymbols = "!@#$%^&*";

        String[] wordSuggestion = {"adventure", "happiness", "oceano", "light", "mountain", "harvest", "wisdom", "camaleao", "liberdade", "estrela"  };
        String randomWord = wordSuggestion[random.nextInt(wordSuggestion.length)];

        String tip = "Dica: Antes de salvar a senha em um gerenciador de senhas, adicione uma palavra aleatória ao final da senha. Uma palavra aleatória foi gerada caso queira usar: " + randomWord;



        String allLetters = lowercaseAlphabet + uppercaseAlphabet;
        String alphabetAndNumbers = allLetters + numbers;
        String allCharacters = alphabetAndNumbers + specialSymbols;

        System.out.println("------- Gerador de Senhas -------");
        System.out.println("Nível de segurança: Básica(1), Média(2), Forte(3)");
        System.out.print("Digite o nível de segurança da senha: ");
        int securityLevel = scanner.nextInt();


        if (securityLevel < 1 || securityLevel > 3) {
            System.out.println("Nível inválido! Escolha 1, 2 ou 3.");
            return;
        }

        System.out.print("Quantos caracteres? (entre 8 e 50): ");
        int passwordLength = scanner.nextInt();


        if (passwordLength < 8 || passwordLength > 50) {
            System.out.println("Tamanho inválido! Escolha entre 8 e 50.");
            return;
        }


        String chosenCharacters;
        switch (securityLevel) {
            case 1:
                chosenCharacters = allLetters;
                break;
            case 2:
                chosenCharacters = alphabetAndNumbers;
                break;
            case 3:
                chosenCharacters = allCharacters;
                break;
            default:
                return;
        }


        String password = generateRandomPassword(random, chosenCharacters, passwordLength);
        System.out.println("Sua senha foi gerada: " + password);
        System.out.println(tip);

        scanner.close();
    }

    public static String generateRandomPassword(Random random, String characters, int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}
