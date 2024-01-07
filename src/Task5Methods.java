import java.util.Scanner;

public class Task5Methods {
    public static final String ONE = "один";
    public static final String TWO = "два";
    public static final String THREE = "три";
    public static final String FOUR = "четыре";
    public static final String FIVE = "пять";
    public static final String SIX = "шесть";
    public static final String SEVEN = "семь";
    public static final String EIGHT = "восемь";
    public static final String NINE = "девять";
    public static final String ZERO = "ноль";
    public static final String UNKNOWN = "Неизвестно";


    public static void main(String[] args) {
        System.out.println(sumNumber(1236));
        String inputUser = inputUser();
        String name = null;
        int number = 0;

        while (!checkInput(inputUser)){
            inputUser = inputUser();
        }

        String[] arrayInputString = inputUser.split(" ");
        name = arrayInputString[0];
        number = Integer.parseInt(arrayInputString[1]);
        number = sumNumber(number);
        greeting(name, converterNumToString(number));
    }

    public static String inputUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean checkInput(String input) {
        boolean flag = false;
        String[] text  = input.split(" ");
        if (text.length != 2) {
            System.out.println("You input should contains 2 word:\n " +
                    "User name and number\n" +
                    "Please, repeat your input");
            return flag;
        } else if (text[1].length() < 2 || text[1].length() > 5) {
            System.out.println("You second word should contains:\n " +
                    "Number from 2 to 5\n" +
                    "Please, repeat your input");
            return flag;
        }
        return true;
    }
    public static int sumNumber(int number) {
        if (number == 0) {
            return number;
        }
        return number % 10 + (sumNumber(number / 10));
    }

    public static String converterNumToString(int num) {
        switch (num) {
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            case 0:
                return ZERO;
            default:
                return UNKNOWN;
        }
    }

    public static void greeting(String name, String sum){
        System.out.printf("Здравствуйте %s! Сумма цифр в числе = %s", name, sum);
    }
}
