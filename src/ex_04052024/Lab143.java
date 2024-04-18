package ex_04052024;

public class Lab143
{
    public static void main(String[] args) {
        String s1 = "Saurabh"; //SCP
        String s2 = new String("Saurabh"); // OA

        // String  - Immutable -> Once created can't be changed.


        StringBuffer stringBuffer = new StringBuffer("Saurabh");
        stringBuffer.append("Yadav");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        // SaurabhYadav

        StringBuilder stringBuilder = new StringBuilder("Saurabh");
        stringBuilder.append("Yadav");


        String password = "pass@123";
        password = "123";

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Saurabh");
        password2.append(" Yadav");
        System.out.println(password2);



    }
}
