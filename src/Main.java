// ������� ��������� ��� �������� ������� ��������� � ������� �����������
//�����������.
//  123456 ������, 321456 ��������, 234561 �������
//  234432 ������, 654321�������, 345678 ������
// ������� ������ ���������� � �������� ������.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> list = new HashMap<>();              // ������� ���
        //String encoding = System.getProperty("console.encoding","cp866");  // ����������� ���������
        Scanner iScanner = new Scanner(System.in);               // ������
        for (int i = 0; i < 3; i++) {                        // ����� ���� ��������� ������
            System.out.print("������� ������� � �������: ");   // ������ ������ ��� �����
            String s = iScanner.nextLine();                      // � ����������
            String[] sMas = s.split(" ");                  // �������� �������� ����� ������ �� 1 � 2��
            list.put(Integer.parseInt(sMas[0]),sMas[1]);       // ������ ������ ��� ������ ������
        }
        for(var el : list.entrySet()){                         // ����� ���� �����
            System.out.println(el.getKey() + " " + el.getValue());  // ����� �������� �� ����� � ��������
        }
        System.out.println();
        for (var el : list.entrySet()){                   // ������ �������� �� ������
            if(el.getValue().equals("������"))            // ���� �������� �����(equels) ������ �����
                System.out.println(el.getKey() + " " + el.getValue() + "\n");  // ����� � ����� �����
        }

    }
}