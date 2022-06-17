public class Main {
    public static void main(String[] args) {
        System.out.println(rand7());

    }

    private static int rand5() {
        return (int)Math.floor(Math.random()*(5)+1);
    }

    static int rand7(){
        int temp = 5*rand5()+rand5()-5;
        if(temp<22)
            return temp%7+1;
        return rand7();
    }
}