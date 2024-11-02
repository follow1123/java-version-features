package cn.y.java;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        String a = null;

        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "a" is null
            at cn.y.java.NullPointerExceptionTest.main(NullPointerExceptionTest.java:7)
         */
        System.out.println(a.length());
    }
}
