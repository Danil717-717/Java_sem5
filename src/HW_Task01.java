// ���������� ��������� ���������� ����� � ������� HashMap,
// ��������, ��� 1 ������� ����� ����� ��������� ���������.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW_Task01 {
    public static void main(String[] args) {
        Map< Integer,  String> list = new HashMap<>();
        System.out.println("��� ������������ ���������� �����!");
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("������� ����� �������� � �������: ");
            String s = iScanner.nextLine();
            String[] sMas = s.split(" ");
            list.put(Integer.parseInt(sMas[0]),sMas[1]);
        }
        for(var el : list.entrySet()){
            System.out.println(el.getKey() + " " + el.getValue());
        }

    }
}
