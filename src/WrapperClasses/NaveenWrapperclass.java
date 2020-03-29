package WrapperClasses;


public class NaveenWrapperclass {

    public static void main(String[] args){
        String x = "100";
        String d ="12.33";
        System.out.println("Output for x+20 without wrapper class : \t" + (x+20));
        System.out.println("Output for d+20 with wrapper class :\t"+ (d+20) );

        // data coversion for string to Integer        
        int i = Integer.parseInt(x);
        System.out.println("Output for x+20 with wrapper class :\t"+ (i+20) );
        
        //String to double conversion.
        double d1= Double.parseDouble(d);
        System.out.println("Output for d+20 with wrapper class :\t"+ (d1+20));
        
        //String to chanracter conversion
        
        
        //String to boolean conversion
        String k = "true";
        System.out.println("boolean value before conversion :\t"+ k);
        boolean b = Boolean.parseBoolean(k);
        System.out.println("boolean value after conversion :\t"+ b);
        
        
        //int to string conversion
        int j=200;
        System.out.println("before conversion value :\t"+ (j+20));
        String s = String.valueOf(j);
        System.out.println("After conversion value :\t"+ (s+20));
    }
}
