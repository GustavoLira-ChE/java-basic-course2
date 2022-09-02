public class Recursion {
    public static void main(String[] args){
        int result = sumUpTo(10);
        System.out.println(result);

        int result2 = sumBetween(5,10);
        System.out.println(result2);
    }
    public static int sumUpTo(int number){
        if(number <= 0){
            return 0;
        } else{
            return number + sumUpTo(number - 1);
        }
    }
    public static int sumBetween(int start, int end){
        if(start < end){
            return end + sumBetween(start, end-1);
        } else{
            return end;
        }
    }
}
