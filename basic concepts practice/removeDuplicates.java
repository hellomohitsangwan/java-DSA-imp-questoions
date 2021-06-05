public class removeDuplicates {
    public static void main(String[] args) {
        int sArray[] = {0 , 1 , 1  , 1,2,3, 4,4,5 , 6 , 7  , 10 ,8};
        int i = 0 , j = 0;

        // for(i = 0 ; i<sArray.length; i++) {
        //     if(sArray[i] != sArray[j]) {
        //         j++;
        //         sArray[j] = sArray[i];
        //     }
        // }

for(i = 0;i<sArray.length - 1 ; i++) {           // here we are doing the aee.length-1 bec. the i+1 will give index out of bond Exception
    if(sArray[i] != sArray[i+1]) {
        j++;
    }
}
    System.out.println(j+1);
    }
}


