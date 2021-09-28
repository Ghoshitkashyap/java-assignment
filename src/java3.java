public class java3 {
    public static void main(String[] args) {
        String str = "ghoshit";
        char character = 'h';
        java3.getOccurance(str, character);
    }
    private static void getOccurance(String str,char character) {
        String userString = str;
        char userChar = character;
        String userCharStr = character + "";
        System.out.println("user data");
        System.out.println("user string->" + userString + "-user character->" + userChar);
        int lengthofuserString = userString.length();
        System.out.println("length of user string->" + lengthofuserString);
        String afterDeleteChar = userString.replace(userCharStr, "");
        int lengthafterdelete = afterDeleteChar.length();
        System.out.println("after deleting character->" + afterDeleteChar + "length->" + lengthafterdelete);
        int actuallength = lengthofuserString - lengthafterdelete;
        System.out.println("number of occurance" + actuallength);
    }
}


