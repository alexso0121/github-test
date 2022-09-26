
public class Main {

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    static int sum(int k) { //use void only when no need to return , otherwise add type
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}