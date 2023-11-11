package corejava.objects;

public class Shoes {
    public int count = 0;

    public Shoes(){

    }

    public static void main(String[] args) {

        Shoes s1 = new Shoes();
        s1.count = 1;
        System.out.println(s1.count);
        Shoes s2 = s1;
        System.out.println(s2.count);


    }
}


class Socks{

}