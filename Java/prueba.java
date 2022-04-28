package apptestting;

public class prueba {
    public static void main(String[] args) {
        int n = (int) (Math.random()*100);
        System.out.println(n);

        String s1 ="abc";
        String s2 ="cde";
        System.out.println(s1.compareTo(s2));


        String s3 ="abc";
        String s4 ="ABC";
        System.out.println(s3.equals(s4));

        System.out.println("Programa que imprime el dominio");
        String email ="aury@aury.com.do";
        String domain="";
        int position =email.indexOf("@");
        domain = email.substring(position+1);
        System.out.println(domain);


    }
}
