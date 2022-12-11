// ¬з€ть набор строк, например: ћороз и солнце день чудесный
// ≈ше ты дремлешь друг прелестный ѕора красавица проснись
// Ќаписать метод который сортирует эти строки по длинне
// с помощью TreeMap. —троки с одинаковой длинной не
// должны потер€тьс€.


import java.util.TreeMap;

public class Task_03 {
    public static void main(String[] args) {
        sortMap();
    }

    public static void sortMap(){
        String s = "ћороз и солнце день чудесный ≈ше ты дремлешь друг прелестный ѕора красавица проснись";
        TreeMap<Double, String> list = new TreeMap<>();
        String [] sMas = s.split(" ");                       // сплитуем по пробелу

        System.out.println(sMas.length);                          // сколько у нас элементов в строке

        for (int i = 0; i < sMas.length; i++) {                           // проходим циклом по списку в наш TreeMap по ключу кол-во букв в слове
            if (list.containsKey((double)sMas[i].length())) {           // если совпадает ключ, то добавим 0.0001 * i
                list.put(sMas[i].length() + 0.0001 * i, sMas[i]);
            }else {
                list.put((double) sMas[i].length(), sMas[i]);           // иначе просто добавл€ем дальше
            }                                                            // в значение само слово, TreeMap сам сортирует по ключу
        }
        for(var el : list.entrySet()){                              // проходим циклом по TreeMap
            System.out.println(el.getKey() + " " + el.getValue());  // выводим ключ значение через пробел
        }
    }
}
