public class Conditionals {
    public static void main(String[] args){
        int number = 18;
        if(number >= 20){
            System.out.println(number);
        } else if (number < 0 ) {
            System.out.println("The number " + number +" is less than 0");
        } else {
            System.out.println("The number "+number +" is less than 20");
        }

        int a = 8;
        int b = 5;

        //Operadores de asignacion
        System.out.println("a es igual a b? -> " + (a==b));
        System.out.println("a es diferente a b? -> " + (a!=b));

        // Operadores relacionales
        System.out.println("a es mayor a b -> " + (a > b));
        System.out.println("a es menor a b -> " + (a < b));
        System.out.println("a es mayor o igual a b -> " + (a >= b));
        System.out.println("a es menor o igual a b -> " + (a <= b));
    }
}
