import java.util.Scanner;
public class TempConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в фаренгейте: ");
        float Fahrenheit, Celsius;
        Fahrenheit = input.nextInt();
        Celsius = ((Fahrenheit-32)*5)/9;
        System.out.println("Температура " +Fahrenheit+ " градусов по Фаренгейту равна: "+ Celsius +" по Цельсию");
    }
}