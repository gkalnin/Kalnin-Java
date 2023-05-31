import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = sc.nextLine().strip();
        inputName = inputName.substring(0,1).toUpperCase() + inputName.substring(1).toLowerCase();
        if (inputName.equals("Вячеслав"))
            System.out.println("Привет, " + inputName);
        else
            System.out.println("Нет такого имени");
    }
}
