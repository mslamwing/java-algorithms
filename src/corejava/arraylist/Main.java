package corejava.arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //without Generics
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("qwe");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("str1");
        arrayList2.add("str2");
        System.out.println(arrayList2);
    }
}
