package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        OrderStrings orderStrings = new OrderStrings();

        System.out.println(orderStrings.order("2rr tt5t 1ee 3gg 4nn"));
        System.out.println(orderStrings.order("is2 Thi1s T4est 3a"));

        FindMissingLetter findLetter = new FindMissingLetter();
        System.out.println(findLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));

    }
}
