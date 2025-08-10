package javaPractice;

public class numbers {
    public static void main(String[] args) {
        byte myNum = 100;
        short myNums = 5000;
        int myNumi = 10000;
        long myNuml = 15000000000L;
        float myNumf = 5.75f;
        double myNumd = 19.99d;

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(myNum);
        System.out.println(myNums);
        System.out.println(myNumi);
        System.out.println(myNuml);
        System.out.println(myNumf);
        System.out.println(myNumd);

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char myGrade = 'B';
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myGrade);
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World!";
        System.out.println(greeting);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items + costPerItem;
        char currency = '$';

        System.out.println("Number of items : " + items);
        System.out.println("Cost per item is : " + costPerItem);
        System.out.println("Total cost per is : " + totalCost);
        System.out.println("Currency used for total cost is : " + currency);
    }
}
