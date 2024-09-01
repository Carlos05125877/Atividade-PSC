public class Main {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Quadrado", "Cubo");

        for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-10d %-10d %-10d%n", i, quadrado, cubo);
        }
    }
}