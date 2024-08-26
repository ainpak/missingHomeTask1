import java.util.ArrayList;
import java.util.Scanner;

public class NumberListManager {

        private ArrayList<Integer> numbers;


        public NumberListManager() {
            numbers = new ArrayList<>();
        }


        public void addFiveNumbers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 5 целых чисел:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int number = scanner.nextInt();
                numbers.add(number);
            }
        }


        public void printNumbers() {
            System.out.println("Список чисел:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }


        public void removeNumberByIndex(int index) {
            if (index >= 0 && index < numbers.size()) {
                numbers.remove(index);
                System.out.println("Число по индексу " + index + " удалено.");
            } else {
                System.out.println("Некорректный индекс.");
            }
        }


        public void updateNumberByIndex(int index, int newValue) {
            if (index >= 0 && index < numbers.size()) {
                numbers.set(index, newValue);
                System.out.println("Число по индексу " + index + " обновлено на " + newValue + ".");
            } else {
                System.out.println("Некорректный индекс.");
            }
        }


        public void checkNumberExists(int number) {
            if (numbers.contains(number)) {
                System.out.println("Число " + number + " содержится в списке.");
            } else {
                System.out.println("Число " + number + " не содержится в списке.");
            }
        }


        public static void main(String[] args) {
            NumberListManager manager = new NumberListManager();


            manager.addFiveNumbers();


            manager.printNumbers();


            System.out.print("Введите индекс для удаления: ");
            Scanner scanner = new Scanner(System.in);
            int indexToRemove = scanner.nextInt();
            manager.removeNumberByIndex(indexToRemove);


            manager.printNumbers();


            System.out.print("Введите индекс для изменения: ");
            int indexToUpdate = scanner.nextInt();
            System.out.print("Введите новое значение: ");
            int newValue = scanner.nextInt();
            manager.updateNumberByIndex(indexToUpdate, newValue);


            manager.printNumbers();

            System.out.print("Введите число для проверки наличия: ");
            int numberToCheck = scanner.nextInt();
            manager.checkNumberExists(numberToCheck);
        }
    }

