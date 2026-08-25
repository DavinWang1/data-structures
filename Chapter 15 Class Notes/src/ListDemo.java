import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Tony");
        staff.addLast("Steve");
        staff.addLast("Wanda");
        staff.addLast("Dr. Strange");
        System.out.println();
        System.out.println();

        System.out.println(staff);
        /*
        listIterator creates new list iterator positioned at head of list, with | representing iterator position
        TSWD
        */
        ListIterator<String> iterator = staff.listIterator(); // |TSWD
        iterator.next();// T|SWD
        //next also returns the element the iterator passed over
        String avenger = iterator.next();
        System.out.println(avenger); //should print steve
        iterator.add("Natasha"); // TSN|WD
        iterator.add("Bruce"); // TSNB|WD
        System.out.println(staff);
        iterator.next(); //TSNBW|D
        iterator.remove(); //removes the last element returned by a call, can only be called after next/prev  TSNB|D
        System.out.println(staff);
        iterator.previous();
        iterator.set("T'Challa"); // TSN|TD
        System.out.println(staff);
        /*
        hasNext often used in while loop
         */
        iterator = staff.listIterator(); // |TSNTD
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")) {
                iterator.remove();
            }
        }
        System.out.println(staff);

        
        for (String n : staff) {
            System.out.print(n + " ");
        }

        iterator = staff.listIterator();
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Tony")) {
                //staff.remove("Tony"); ConcurrentModificationException - can't modify while iterating unless using iterator to do so

            }
        }


        for (String n : staff) {
            if (n.equals("Tony")) {
                //staff.add("Peter"); also doesn't work
            }
        }

    }
}
