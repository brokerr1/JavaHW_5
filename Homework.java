package Java.HomeWork.JavaHW_5;

import java.util.*;

public class Homework {
    public static void main(final String[] args) {
        //Структура тел. книги с помощью HashMap
        TelBook telBook = new TelBook();
        // добавление номеров
        telBook.add("Виктор", "8999123321");
        telBook.add("Виктор", "8912155326");
        telBook.add("Олег", "8917155552");
        telBook.add("Олег", "8913455672");
        telBook.add("Виктор", "899999999");
        telBook.add("Игорь", "899111111");
        telBook.add("Олег", "89923231999");
        telBook.add("Саша", "8888123113");
        telBook.add("Игорь", "8324325234");
        // номера по имемни
        System.out.println(telBook.get("Виктор")); 
        System.out.println(telBook.get("Игорь"));
        System.out.println(telBook.get("Олег"));
        System.out.println(telBook.get("Саша"));
        //вся тел книга
        System.out.println(telBook.show());        
    }
}    
class TelBook {
    private Map<String, List<String>> telBook_hm = new HashMap<>(); //hashMap с ключем именем и значениями в виде листа номеров.
    private List<String> phone_number_list; // лист номеров
    //запись номера
    public void add(String name, String phone_number) {
        if (telBook_hm.containsKey(name)) {
            phone_number_list = telBook_hm.get(name);
            phone_number_list.add(phone_number);
            telBook_hm.put(name, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            telBook_hm.put(name, phone_number_list);
        }
    }
    //получение списка номеров по имени
    public List<String> get(String name) {
        return telBook_hm.get(name);
    }
    //вывод все тел. книги
    public Map<String, List<String>> show() {
        return telBook_hm;
    }
}
