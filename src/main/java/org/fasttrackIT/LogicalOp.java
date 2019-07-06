package org.fasttrackIT;



public class LogicalOp {
    // Ex nr.1
//    public void numbercounting(int startingNumber) {
//        for (int i = startingNumber; i <= 100; i++) {
//            System.out.println(i);}}


    //  Ex nr.2
//    public void numbercounting(int startingNumber) {
//        for (int i = startingNumber; i >= -100; i--) {
//            System.out.println(i);}}


    //Ex nr.3
//    public void numbercounting(int startingNumber, int endingNumber) {
//        for (int i = startingNumber; i <= endingNumber; i++) {
//            System.out.println(i);
//        }
//    }

//    Ex. nr.4
//public void numbercounting(int x, int y){
//   if(x<y){
//    for (int i = x; i <= y; i++){
//    System.out.println(i);
//}}
//   else if(x>y){for (int i =y; i <= x; i++)
//       System.out.println(i);}
//}

        //Ex nr.5
//    public void numbercounting(){
//          for(int i = 1; i<=100; i++){
//    if(i % 2 == 0){
//    System.out.println(i);}}}

//    Ex nr.6
//    public void numbercounting(){
//        for(int i = 1; i<=100; i++){
//            if(i % 2 != 0){
//                System.out.println(i);}}}

//    Ex. nr.7
//    public void numbercounting(int sum){
//
//        int num = 100;
//        for(int i = sum; i <= num; i++)
//        {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);
//    }


////Ex nr 7. varianta 2
//    //N for consecutive numbers = (First Number - Last Number) +1
//    //
//    //Sum of numbers = (First Number + Last Number) * N))/2
//
//public void numbercounting(int givenNumer) {
//int numberOfConsecutiveNumbers = (100 - givenNumer)+ 1;
//int sum = ((givenNumer + 100)* numberOfConsecutiveNumbers)/2;
//    System.out.println("Sum is " + sum);
//
//    }
//}

//Ex.nr8
    public void numbercounting(int givenNumer) {
        int numberOfConsecutiveNumbers = (100 - givenNumer)+ 1;
        int sum = ((givenNumer + 100)* numberOfConsecutiveNumbers)/2;
        double average = sum/numberOfConsecutiveNumbers;
        System.out.println("Average is " + average);

    }
}

















