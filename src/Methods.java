public class Methods {
    //Write a program to sum all the values of a given Array in Java.
    public static double sumDouble(double[] numbers){
        double d = 0;
        for(int i=0; i < numbers.length; i++){
            d+=numbers[i];
        }
        return d;
    }
}
