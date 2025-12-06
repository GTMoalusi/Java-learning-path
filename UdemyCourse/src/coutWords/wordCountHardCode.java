package coutWords;

public class wordCountHardCode {
    public static void main(String[] args) {
        String str = "I love Java and it is fun and my name is Thabang Moalusi";
        boolean inWord = false;
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                if(!inWord){
                    counter++;
                    inWord = true;
                }
            }else{
                inWord = false;
            }
        }

        System.out.println("Number of words is = " + counter);
    }
}
