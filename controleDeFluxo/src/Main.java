import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int parametroUm;
        System.out.println("Digite o parametro 1: ");
        parametroUm = input.nextInt();

        int parametroDois;
        System.out.println("Digite o parametro 2: ");
        parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (Exception erro){

        }
    }
    static void contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException{
        int contagem = parametroUm - paramentroDois;
        if (parametroUm > parametroUm){
            return;
        }
    }
}