package quadrantes;

import java.util.Scanner;

public class App {
    
    public static boolean valida(double x1,double y1,double x2,double y2){
        return x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0 && x1 != x2 && y1 != y2;
    }
    
    public static double leCoordenada(int i) {
        Scanner sc = new Scanner(System.in);
        switch (i) {
            case 1:System.out.print("Digite a coordenada x1: ");break;
            case 2:System.out.print("Digite a coordenada y1: ");break;
            case 3:System.out.print("Digite a coordenada x2: ");break;
            default:System.out.print("Digite a coordenada y2: ");break;
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        char resp = 0;
        do{
            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4);
            

            if (valida(x1, y1, x2, y2)) {
                System.out.println("Coordenadas válidas!");
                Retas rt = new Retas(x1, y1, x2, y2);
                System.out.printf("O comprimento da reta é: %.2f\n", rt.comprimento());
                System.out.println(rt.exibe());
                cont++;
                System.out.println("Criou "+cont+" reta(s)\n\n");
            } else {
                System.out.println("Coordenadas invalidas!");
            }
            System.out.println("Deseja repetir?(S/N");
            resp = sc.next().charAt(0);
        }while(resp == 'S' || resp == 's');
    }
    
}
