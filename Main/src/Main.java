public class Main {
    public static void main(String[] args) {

        //Temperature tracker.

        double[] temperature = {27.4, 19.3, 21.6, 25.4, 38.4, 36.5, 20.7};
        double sum = 0;
        for(double temp : temperature){
            System.out.println(temp);
            sum += temp;
        }

        System.out.printf("The average is: %.2f",  (sum / temperature.length));
    }
}