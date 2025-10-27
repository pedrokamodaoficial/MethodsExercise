import java.time.LocalTime;

public class HoraDia {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();
        System.out.println(hora);
        cumprimentos(hora);
    }
    public static void cumprimentos(int hora){
        if (hora >= 0 && hora <= 5){
            System.out.println("Ótima madrugada!");
        } else if (hora >= 6 && hora <= 12){
            System.out.println("Está amanhecendo, bom dia!");
        } else if (hora >= 13 && hora <= 18){
            System.out.println("A tarde chega, boa tarde!");
        } else if (hora >= 19 && hora <= 23){
            System.out.println("Está anoitecendo, boa noite!");
        } else {
            System.out.print("Não foi possível identificar a hora.");
        }
    }
}
