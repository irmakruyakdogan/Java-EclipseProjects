public class Strings {

    public static void main(String[] args){

        String mess = "The weather is very nice today";

        System.out.println(mess);

        /*System.out.println(mess.length());
        System.out.println(mess.charAt(4));
        System.out.println(mess.concat(", like you :3"));
        System.out.println(mess.startsWith("T"));
        System.out.println(mess.endsWith(":3"));

        char[] character = new char[5];
        mess.getChars(0, 4, character, 0);
        System.out.println(character);
        System.out.println(mess.indexOf("i"));
        System.out.println(mess.lastIndexOf("r"));
         */

        System.out.println(mess.replace("weather", "cake"));
        System.out.println(mess.substring(2, 12));

        for (String word : mess.split(" ")){

            System.out.println(word);

        }

        System.out.println(mess.toLowerCase());
        System.out.println(mess.toUpperCase());

        System.out.println(mess.trim());

        int l = 4;
        System.out.println((l >> 1)+(l << 2) );

        int x = 2;
        System.out.println(++x - x++ - x-- + x++);

        System.out.printf( "%S","AdA");
    }

}
