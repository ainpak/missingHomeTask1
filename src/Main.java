import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberListManager manager = new NumberListManager();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Добавление пяти целых чисел:");
        manager.addFiveNumbers();


        System.out.println("\nВывод всех элементов списка:");
        manager.printNumbers();


        System.out.print("\nВведите индекс элемента для удаления: ");
        int indexToRemove = scanner.nextInt();
        manager.removeNumberByIndex(indexToRemove);


        System.out.println("\nВывод оставшихся элементов списка:");
        manager.printNumbers();


        System.out.print("\nВведите индекс элемента для изменения: ");
        int indexToUpdate = scanner.nextInt();
        System.out.print("Введите новое значение: ");
        int newValue = scanner.nextInt();
        manager.updateNumberByIndex(indexToUpdate, newValue);


        System.out.println("\nВывод всех элементов списка после изменения:");
        manager.printNumbers();


        System.out.print("\nВведите число для проверки его наличия в списке: ");
        int numberToCheck = scanner.nextInt();
        manager.checkNumberExists(numberToCheck);
    }
}
