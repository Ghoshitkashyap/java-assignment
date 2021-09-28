public class ReverseString {
    public static void main(String[] args)
        {
            String input = "Ghoshit kashyap";
            StringBuffer input1 = new StringBuffer();
            input1.append(input);
            input1.reverse();
            System.out.println(input1);
            input1.deleteCharAt(4);
            input1.deleteCharAt(9);
            System.out.println("after delete index 4 and 9:");
            System.out.println(input1);
        }
    }

