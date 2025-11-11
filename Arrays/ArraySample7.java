public class ArraySample7 {
    public static void main(String[] args) {
        
        int num[] = {2, 3, 4, 5, 6, 7};
        int even = 0; 
        int odd = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                even++; 
            } else 
                odd++;
        }

        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }

}
