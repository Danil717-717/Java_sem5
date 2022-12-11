import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Task_03_2 {
    public static void main(String[] args) {
        sortMap();
    }


    public static void sortMap(){
        String s = "Мороз и солнце день чудесный Еше ты дремлешь друг прелестный Пора красавица проснись";
        TreeMap<Integer, ArrayList<String>> list = new TreeMap<>();
        String [] sMas = s.split(" ");

        System.out.println(sMas.length);

        for (int i = 0; i < sMas.length; i++) {
            if(list.containsKey(sMas[i].length())){
                list.get(sMas[i].length()).add(sMas[i]);
            }else{
                ArrayList<String> lst = new ArrayList<>();
                lst.add(sMas[i]);
                list.put(sMas[i].length(), lst);
            }

        }
        for(var el : list.entrySet()){
            System.out.println(el.getKey() + " " + el.getValue());
        }
   }
}