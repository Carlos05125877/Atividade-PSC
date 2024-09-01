/*Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se
passaram desde o início do dia (00:00).*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int minutosDia;
        int horas;
        int minutos;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o horário (HH:MM): ");
        String horaString = scanner.nextLine();
    
        
        String[] partesHora = horaString.split(":");
        horas = Integer.parseInt(partesHora[0]);
        minutos = Integer.parseInt(partesHora[1]);
        
        if(horas>23 || minutos>59){
            System.out.println("Hora Inválida");
        } else{
            
        minutosDia = (horas * 60) + minutos;
        System.out.println("Já se passaram " + minutosDia + " minutos desde o início do dia.");
        }

    }
}