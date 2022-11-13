import java.util.Scanner;

public class Error {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int zeroChecker = scanner.nextInt();

        if (zeroChecker == 0){
            System.out.println("Ошибок не обнаружено");
        }
        else {
            for (int i = 0; i < 3; i++){
                System.out.println("ERROR");
            }
        }
    }
}