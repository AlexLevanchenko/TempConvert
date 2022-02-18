import java.util.Scanner;
public class TempConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в фаренгейте: ");
        float fahrenheit;
        fahrenheit = input.nextInt();
        final double celsius = ((fahrenheit-32)*5)/9;
        System.out.println("Температура " +fahrenheit+ " градусов по Фаренгейту равна: "+ celsius +" по Цельсию");
    }
}
