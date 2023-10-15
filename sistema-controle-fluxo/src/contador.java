import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro...");
        }

        scanner.close();

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        for (int x = parametroUm; x <= parametroDois; x++){
            System.out.println("Imprimindo número: " + x);
        }
    }

}
