public class MathOperations extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().getName() == "Add"){
            printAdd();
        } else if (Thread.currentThread().getName() == "Mul") {
            printMul();
        }
    }

    public void printAdd(){
        //System.out.println(Thread.currentThread().getName());
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum = sum + i;
        }
        System.out.println(Thread.currentThread().getName() + "Summation : " + sum);
    }

    public void printMul(){
        //System.out.println(Thread.currentThread().getName());
        double mul = 1.0;
        for (int i = 1; i <= 100 ; i++) {
            mul = mul * i;
        }
        System.out.println(Thread.currentThread().getName() + "mul : " + mul);

    }
}
