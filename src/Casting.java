public class Casting {
    public static void main(String[] args){

        char c = 'z';
        int cInt = c;

        System.out.println("Hola mundo");
        System.out.println(c);
        System.out.println(cInt);

        int i = 250;
        long iLong = (long) i;
        short iShort = (short) iLong;

        System.out.println(i);
        System.out.println(iLong);
        System.out.println(iShort);

        double d = 301.067;
        long dLong = (long) d;
        System.out.println(d);
        System.out.println(dLong);

        int i2 = 100;
        i2 += 5000.66;

        System.out.println(i2);

        int i3 = 737;
        i3 *= 100;
        float i3Float = (float) i3;

        System.out.println(i3);
        System.out.println(i3Float);

    }
}