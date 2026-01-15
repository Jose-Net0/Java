package quadrante3;

import java.util.Scanner;

public class App {
    
    
    public static double leCoordenada(int i) {
        Scanner sc = new Scanner(System.in);
        switch (i) {
            case 1 -> System.out.print("Digite a coordenada x1: ");
            case 2 -> System.out.print("Digite a coordenada y1: ");
            case 3 -> System.out.print("Digite a coordenada x2: ");
            default -> System.out.print("Digite a coordenada y2: ");
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do{
            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4);
            

            if (Validacao.valida(x1, y1, x2, y2)) {
                System.out.println("Coordenadas válidas!");
                Retas rt = new Retas(x1, y1, x2, y2);
                System.out.printf("O comprimento da reta é: %.2f\n", rt.comprimento());
                System.out.println(rt.exibe());             
                System.out.println("Criou "+Retas.cont+" reta(s)\n\n");
            } else {
                System.out.println("Coordenadas invalidas!");
            }
            System.out.println("Deseja repetir?(S/N)");
            resp = sc.next().charAt(0);
        }while(resp == 'S' || resp == 's');
    }
    
}
