public class ArraySample3 {
    public static void main(String[] args) {
        
        int num[] = {3,4,5};
        int sum  = 0;

        for(int i =0 ; i < num.length; i++){
            sum += num[i];  
        }
        System.out.print(sum);
    }
}
