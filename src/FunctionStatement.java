public class FunctionStatement {
    public static void main(String[] args){
        double radius = 3;
        double area1 = circleArea(radius);
        System.out.println(area1);
        System.out.println(sphereArea(radius));
        System.out.println(sphereVolume(radius));
        System.out.println(convertToDolar(100,"MXN"));

        myMethod();
    }
    //modificador de acceso, valor que regresa, nombre, argumentos
    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public static double sphereArea(double radius){
        return 4 * Math.PI * Math.pow(radius,2);
    }
    public static double sphereVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius,3);
    }

    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COL":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
    public static void myMethod() {
        System.out.println("Hello world!");
    }
}
