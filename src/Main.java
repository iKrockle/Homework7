public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
    }

    public static void task1(){
        int summ=0;
        int month=0;
        while (summ<=2459000)
        {
            summ+=15000;
            month++;
        }
        System.out.println("Месяц "+month+", сумма накоплений равна "+summ+" рублей");
    }

    public static void task2(){
        int i=0;
        while (i<10)
        {
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        while (i>0)
        {
            System.out.print(i+" ");
            i--;
        }
    }
    public static void task3(){
        int born=17;
        int die=8;
        int ppl=12000000;
        int demography;
        int i=1;
        for(;i<10;i++){
            demography = (born-die)*(ppl/1000);
            ppl+=demography;
        }
        System.out.println("Год "+i+", численность населения составляет "+ppl);
    }

    public static void task4(){
        double summ=15000;

        for(int i=1;summ<=12000000;i++){
            summ+=summ*0.07;
            System.out.println(i+" месяц, сумма "+String.format("%.2f",summ));
        }
    }

    public static void task5(){
        double summ=15000;

        for(int i=1;summ<=12000000;i++){
            summ+=summ*0.07;
            if (i%6==0) {
                System.out.println(i+" месяц, сумма "+String.format("%.2f",summ));
            }
        }
    }

    public static void task6(){
        double summ=15000;

        for(int i=1;i<=9*12;i++){
            summ+=summ*0.07;
            if (i%6==0) {
                System.out.println(i + " месяц, сумма " + String.format("%.2f", summ));
            }
        }
    }

    public static void task7(){
        for(int firstFr=4;firstFr<=31;firstFr+=7){
            System.out.println("Сегодня пятница, "+firstFr+"-е число");
        }
    }

    public static void task8(){
        for(int i=0;i<=2123;i+=79){
            if (i>=1823) {
                System.out.println(i);
            }
        }
    }
}