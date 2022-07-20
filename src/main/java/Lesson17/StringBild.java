package Lesson17;

public class StringBild {

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result=true;
        if(sb1.length()==sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i)!=sb2.charAt(i)) {
                    result=false;
                    break;
                }
            }
        }
        else {
            result=false;
        }
        return result;
    }





    public static void main(String[] args) {
        StringBuilder sb3=new StringBuilder("Htello");
        StringBuilder sb4=new StringBuilder("Hello");
        System.out.println(ravenstvo(sb3,sb4));
    }
}
