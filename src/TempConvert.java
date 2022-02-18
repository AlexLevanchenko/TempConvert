import java.util.Scanner;
public class TempConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в фаренгейте: ");
        final double coefficientT = 1.8;
        final double zeroCelsius = 32;
        float fahrenheit;
        fahrenheit = input.nextInt();
        double celsius = (fahrenheit-zeroCelsius)/coefficientT;
        System.out.println("Температура " +fahrenheit+ " градусов по Фаренгейту равна: "+ celsius +" по Цельсию");
    }
}
