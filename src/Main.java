import task2.model.Person;
import task2.model.Phone;

import javax.crypto.Cipher;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Person person = new Person<>("fifa",52);


        List<Person> personList = new ArrayList<>(List.of(new Person<>("hiho", 25),
                new Person<>("nino", 52), new Person<>("pipo", 14), new Person<>("lilo", 25), new Person<>("Jiro", 25)));

        Phone phone = new Phone<>("Sumsung",64);
        Phone phone1 = new Phone<>("Mi",128);
        Phone phone2 = new Phone<>("Gira",97);

        List<Phone>phoneList = new ArrayList<>();
        phoneList.add(phone);
        phoneList.add(phone1);
        phoneList.add(phone2);


        Map<Integer, Phone>phoneMap=new TreeMap<>();



        getAllMethod(personList);


        //System.out.println(findMaxElement(List.of(4, 6, 1, 0, -9, 8, 8 - 10), 2, 6));
    }

    public static <T extends Comparable<T>> T findMaxElement(List<T> list, int start, int end) {
        T max = list.get(start);
        for (int i = start; i < end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T> T getAllMethod(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
        return null;
    }

    public static <T> T sortMethod(List<T> list) {

        return null;
    }
}
