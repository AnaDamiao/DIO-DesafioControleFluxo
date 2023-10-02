import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Informe o primeiro número: ");
        int numero1 = terminal.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = terminal.nextInt();
        
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro.");
        }

        int contagem = numero2 - numero1;
        for (int index = 1; index <= contagem; index++) {
            System.out.println("Imprimindo o número " + index);
        }
    }
}
//Classe exceção
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagemExcecao) {
        super(mensagemExcecao);
    }
}
