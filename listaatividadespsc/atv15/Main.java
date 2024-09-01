/*Escreva um algoritmo que recebe dois pontos do plano cartesiano P1 = (x1, y1) e P2 = (x2, y2)
e calcula a distância entre eles, dada por d(P1, P2) = p
(x1 − x2)
2 + (y1 − y2)
2*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2, y1, y2, diferencaX, diferencaY, quadradoDiferencaX, quadradoDiferencaY, somaQuadrados, distancia;
        
        System.out.print("Digite a coordenada x do ponto P1: ");
        x1 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do ponto P1: ");
        y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x do ponto P2: ");
        x2 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do ponto P2: ");
        y2 = scanner.nextDouble();

        
        diferencaX = x1 - x2;
        diferencaY = y1 - y2;
        quadradoDiferencaX = diferencaX * diferencaX;
        quadradoDiferencaY = diferencaY * diferencaY;
        somaQuadrados = quadradoDiferencaX + quadradoDiferencaY;
        distancia = Math.sqrt(somaQuadrados);

        
        System.out.printf("A distância entre os pontos é: %.2f ", distancia);
    }
}
