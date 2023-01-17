public class Main {
    public static void main(String[] args) {
        System.out.println("test 1: " + (5 == pickBigger(3,5)));
        System.out.println("test 2: " + (4 == pickBigger(2,4)));
        System.out.println("test 2: " + (4 == pickBigger(4,2)));

    }

    private static int pickBigger(int first, int second) {
        if (first > second){
            return first;
        }else{
            return second;
        }
    }
}
