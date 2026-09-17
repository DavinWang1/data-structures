import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //create priority queue of strings
        //must be composed of comparable objects
        Queue<String> students = new PriorityQueue<>();
        students.add("Shiva");
        students.add("Claire");
        students.add("Jason");
        students.add("Shiva 2");
        students.add("Manny");
        students.add("Davin");
        students.add("Shiva 3");
        students.add("Student of the Month");

        while (students.size() > 0) {
            System.out.println(students.remove());
        }


        Queue<WorkOrder> toDo = new PriorityQueue<>();
        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Student of the Moth"));
        toDo.add(new WorkOrder(8, "top 1"));
        while (toDo.size() > 0) {
            System.out.println(toDo.remove());
        }
    }
}
