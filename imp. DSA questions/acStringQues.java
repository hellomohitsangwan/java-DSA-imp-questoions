public class acStringQues {
    public static void main(String[] args) {
        String s = "ygEFefeFEfefRFRfwefWEf";
       char ca[] = s.toCharArray();

        for(int i = 0; i < ca.length ; i++) {

            char r = ca[i];

            if(Character.isLowerCase(r)) {
                ca[i] = Character.toUpperCase(r);
            }
            else{
                ca[i] = Character.toLowerCase(r);
            }
        }
        System.out.println(String.valueOf(ca));
    }
}
