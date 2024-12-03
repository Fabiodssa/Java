package company.jogosenha;

import java.util.Random;
import java.util.Scanner;

public class JogoSenha {
    public static void main(String[] args) {

        int[] senha = gerarSenha();
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Senha correta: ");
        int tentativas = 0;
        for (int i = 0; i < 4; i++) {
                    System.out.print(senha[i]);
                }
        System.out.println("");
        
        while (tentativas < 10) {
            int[] tentativa = obterTentativa(scanner);
            // Verifica a tentativa
            int[] resultado = verificarTentativa(tentativa, senha);
            int corretos = resultado[0];
            int errados = resultado[1];
            System.out.println("Corretos: " + corretos + ", Errados: " + errados);
            
            // Se acertar a senha finaliza o jogo
            if (corretos == 4) {
                System.out.println("Parabéns! Você acertou a senha.");
                break;
            }

            tentativas++;
            
            if (tentativas == 10) {
                System.out.println("Você esgotou suas tentativas! A senha era: ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(senha[i] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }

    // Módulo para gerar a senha aleatória
    public static int[] gerarSenha() {
        Random rand = new Random();
        int[] senha = new int[4];
        for (int i = 0; i < 4; i++) {
            senha[i] = rand.nextInt(6) + 1; // Números entre 1 e 6
        }
        return senha;
    }

    // Módulo para obter a tentativa do jogador
    public static int[] obterTentativa(Scanner scanner) {
        System.out.println("Digite a sua tentativa de 4 dígitos (números de 1 a 6):");
        String entrada = scanner.nextLine();

        while (entrada.length() != 4) {
            System.out.println("Por favor, digite exatamente 4 números.");
            entrada = scanner.nextLine();
        }
        
        int[] tentativa = new int[4];
        for (int i = 0; i < 4; i++) {
            tentativa[i] = Character.getNumericValue(entrada.charAt(i));
        }
        return tentativa;
    }

    // Módulo para verificar a tentativa em relação à senha
    public static int[] verificarTentativa(int[] tentativa, int[] senha) {
        int corretos = 0;  
        int errados = 0;   

        // Vetor auxiliar para marcar os números que já foram verificados
        boolean[] senhaVerificada = new boolean[4];
        boolean[] tentativaVerificada = new boolean[4];

        // Verifica os números corretos na posição correta
        for (int i = 0; i < 4; i++) {
            if (senha[i] == tentativa[i]) {
                corretos++;
                senhaVerificada[i] = true;
                tentativaVerificada[i] = true;
            }
        }

        // Verifica os números corretos, mas em posição errada
        for (int i = 0; i < 4; i++) {
            if (!tentativaVerificada[i]) { 
                for (int j = 0; j < 4; j++) {
                    if (!senhaVerificada[j] && tentativa[i] == senha[j]) {
                        errados++;
                    }
                }
            }
        }

        return new int[]{corretos, errados};
    }
}

