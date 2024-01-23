package test;

public class T2023_12_19_1 {

    //
    public void data(int year, int month, int day) {
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public static void main(String[] args) {
        //实例化T
        T2023_12_19_1 t = new T2023_12_19_1();
        
        //对象t调用成员方法data
        t.data(2023, 12, 19);
    }
}