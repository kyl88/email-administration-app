package emailapp;

public class EmailApp {

    public static void main(String[]args){

        Email em1 = new Email("Kyle","Padayachee");

        em1.setAlternativeEmail("padayacheek@gmail.com");
        System.out.println(em1.getAlternativeEmail());

         System.out.println(em1.showInfo());








    }
}
