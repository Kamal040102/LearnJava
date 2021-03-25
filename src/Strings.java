public class Strings{
    public static void main(String[] args) {
        String name = "Kamal";

        //Length
        System.out.println(name.length());
        
        //Lower Case
        System.out.println(name.toLowerCase());

        //Upper Case
        System.out.println(name.toUpperCase());

        //Substring with only initial index
        System.out.println(name.substring(1));

        //Substring with Initial and Last index
        System.out.println(name.substring(2, 5));

        //Trim
        String name1 = "        Kamal         ";
        System.out.println(name1);
        System.out.println(name1.trim());

        //Character Replace
        System.out.println(name.replace('m', 'p'));

        //String Replace
        System.out.println(name.replaceAll("mal", "mla"));
    }
}