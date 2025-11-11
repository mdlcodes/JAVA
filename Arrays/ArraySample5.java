public class ArraySample5 {
    public static void main(String[] args) {
        
        //find the max and min in the given set of arrays

        int num[] = {3, 10, 24, 3, 5};
        int max = num[0];
        int min = num[0];

        for(int i = 0; i < num.length; i++){
            if(num [i] > max){
                max = num[i];
            }
            if(num [i] < min){
                min = num[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
