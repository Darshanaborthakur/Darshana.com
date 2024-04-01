package Wrapperclass;
//Enum are user-defined data types

enum Dept {
    CS, IT, CIVIL, ECE
}

public class EnumDemo {
    public static void main(String[] args) {

        Dept d = Dept.CS;
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("IT"));

        Dept list[] = Dept.values();
        for (Dept x : list) {
            System.out.println(x);
        }
    }
}
