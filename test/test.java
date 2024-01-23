package test;

public class test {

    static int i;//static初值为1

    public int aMethod() {
        i++;
        return i;
    }
    public void bMethod() {
        test test = new test();
        test.aMethod();
        System.out.println(test.aMethod());
    }



    public void astring() {
        String s = new String("abcdefg");
        for (int i = 0; i < s.length(); i += 2) {// i第一次输出的值是0
            System.out.print(s.charAt(i));//charAt意思是第i个字符在字符串str中所占的位置的值
        }
    }






    class AB {
        String s1;
        String s2;

        public AB(String str1, String str2) {
            s1 = str1;
            s2 = str2;
        }

        public String toString() {
            return s1 + s2;

        }

    }
    public void helloworld() {
        {
            AB s = new AB("Hello!", "I love JAVA.");
            System.out.println(s.toString());
        }
        
    }




    public static void main(String args[]) {

    }
}
