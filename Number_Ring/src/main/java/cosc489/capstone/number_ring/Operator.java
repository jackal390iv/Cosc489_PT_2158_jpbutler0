/*
 * Class: COSC 489
 * Project: Capstone
 */
package cosc489.capstone.number_ring;

/**
 * This class is simply the project initializer and tester; the 'run()' method
 * initializes the programs main function; the tester methods are explained per
 * unit description
 *
 * @author Jonathan Butler <https://github.com/jackal390iv>
 */
public class Operator {

    private static Holder holder = new Holder();

    public static void main(String[] args) throws Exception {
        run();
        //test1();
        //test2();
        //test3();
        //test4();
    }

    /**
     * Initializes projects main function
     */
    public static void run() {
        holder.run();
    }

    /**
     * tests append, jump, printRingClockwise, and printRingCounterClockwise
     * functions
     */
    public static void test1() {
        holder.append(1);        //inserts #1 (only node)
        holder.printCurrent();      //prints first & only node
        holder.append(2);        //inserts #2 in front of #1 and behind #1
        holder.printCurrent();      //prints #2
        holder.append(3);        //inserts #3 in front of #2 and behind #1
        holder.printCurrent();      //prints #3
        holder.append(4);        //inserts #4 in front of #3 and behind #1
        holder.printCurrent();      //prints #4
        holder.append(5);        //inserts #5 in front of #4 and behind #1
        holder.printCurrent();      //prints #5
        holder.append(6);        //inserts #6 in front of #5 and behind #1
        holder.printCurrent();      //prints #6

        holder.jump(-1);//moves current node from #6 to #5
        holder.printCurrent();      //prints #5
        holder.jump(-1);//moves current node from #5 to #4
        holder.printCurrent();      //prints #4
        holder.jump(-1);//moves current node from #4 to #3
        holder.printCurrent();      //prints #3
        holder.jump(-1);//moves current node from #3 to #2
        holder.printCurrent();      //prints #2
        holder.jump(-1);//moves current node from #2 to #1
        holder.printCurrent();      //prints #1

        holder.printRingClockwise();//prints ring clockwise
        holder.printRingClockwise();//prints ring clockwise

        holder.jump(-1);//moves current node from #1 to #6
        holder.printCurrent();      //prints #6

        holder.printRingCounterClockwise();//prints ring counter-clockwise
        holder.printRingCounterClockwise();//prints ring counter-clockwise
    }

    /**
     * tests insert, delete, and deleteAll functions
     */
    public static void test2() {
        holder.insert(1);
        holder.printCurrent();
        holder.insert(2);
        holder.printCurrent();
        holder.insert(3);
        holder.printCurrent();
        holder.insert(8);
        holder.printCurrent();
        holder.insert(4);
        holder.printCurrent();
        holder.insert(5);
        holder.printCurrent();
        holder.jump(2);

        holder.printRingClockwise();//prints ring clockwise

        holder.delete();

        holder.printRingClockwise();//prints ring clockwise

        holder.jump(3);

        holder.printRingClockwise();//prints ring clockwise

        holder.deleteAll();

        holder.printRingClockwise();//prints ring clockwise
    }

    /**
     * tests move function
     */
    public static void test3() {
        holder.append(2);
        holder.append(3);
        holder.append(1);
        holder.append(4);
        holder.append(5);

        System.out.printf("\nOriginal: ");
        holder.printRingClockwise();//prints ring clockwise

        holder.jump(3);

        System.out.printf("\nMove To Issue: ");
        holder.printRingClockwise();//prints ring clockwise

        //holder.move(2);
        //holder.move(7);
        //holder.move(12);
        //holder.move(-2);
        //holder.move(-7);
        holder.move(-12);

        System.out.printf("\nIssue Moved: ");
        holder.printRingClockwise();//prints ring clockwise
    }

    /**
     * tests sort function
     */
    public static void test4() {
        holder.append(5);
        holder.append(2);
        holder.append(15);
        holder.append(4);
        holder.append(9);
        holder.append(3);
        holder.append(236);
        holder.append(6);

        System.out.printf("\nOriginal: ");
        holder.printRingClockwise();//prints ring clockwise

        holder.sort();

        System.out.printf("\n\nFinished Sorting: ");
        holder.printRingClockwise();//prints ring clockwise
    }
}
