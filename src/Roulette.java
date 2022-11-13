import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner firstThrow = new Scanner(System.in);
        System.out.println("Первый бросок:");
        int firstTry = firstThrow.nextInt();
        Scanner secondThrow = new Scanner(System.in);
        System.out.println("Второй бросок:");
        int secondTry = secondThrow.nextInt();

        if (firstTry == 36 && secondTry == 17){
            System.out.println("Джекпот!");
        }
        else if (firstTry == 36 || secondTry == 17){
            System.out.println("Утишительный приз");
        }
        else System.out.println("Попробуй ещё");
    }
}