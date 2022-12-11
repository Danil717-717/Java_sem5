// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
//организации.
//  123456 Иванов, 321456 Васильев, 234561 Петрова
//  234432 Иванов, 654321Петрова, 345678 Иванов
// Вывести данные сотрудника с фамилией Иванов.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> list = new HashMap<>();              // создаем Мар
        //String encoding = System.getProperty("console.encoding","cp866");  // попробовать кодировку
        Scanner iScanner = new Scanner(System.in);               // сканер
        for (int i = 0; i < 3; i++) {                        // через цикл заполняем список
            System.out.print("Введите паспорт и фамилию: ");   // просим ввести что нужно
            String s = iScanner.nextLine();                      // в переменную
            String[] sMas = s.split(" ");                  // сплитуем введеное через пробел на 1 и 2ое
            list.put(Integer.parseInt(sMas[0]),sMas[1]);       // парсим первое инт второе строка
        }
        for(var el : list.entrySet()){                         // через цикл вывод
            System.out.println(el.getKey() + " " + el.getValue());  // вывод елемента по ключу и значению
        }
        System.out.println();
        for (var el : list.entrySet()){                   // циклом проходим по списку
            if(el.getValue().equals("Иванов"))            // если значение равно(equels) Иванов вывод
                System.out.println(el.getKey() + " " + el.getValue() + "\n");  // вывод в такой форме
        }

    }
}