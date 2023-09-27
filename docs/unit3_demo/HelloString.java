//
// HelloString.java
//


public class HelloString
{
    public static void main(String[] args)
    {
        String s = "Hello, world!";
        System.out.println(s);

        System.out.println(s.substring(0,5));   // [begin, end)
        System.out.println(s.substring(7));     // default: end == length()
        //System.out.println(s.substring(7,13));

        System.out.println("length(): " + s.length());

        String t = s.substring(0,5);
        System.out.println("t: " + t);

        String u = "Hello";
        System.out.println("u: " + u);
        System.out.println("t==u: " + (t==u));
        System.out.println("t.equals(u): " + t.equals(u));
    }
}


