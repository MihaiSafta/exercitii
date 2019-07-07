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
//    public void sum(int nr) {
//        int sum = 0;
//        for (int i = nr; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum = " + sum);
//    }
//}

//Ex nr.8
//Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
// pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La fnal, metoda sa returneze media.
// Apelati metoda in clasa App, metoda main() pentru a verifca daca functioneaza.

//public void sum(int nr){
//    int sum =0;
//    int totalnr = 0;
//    for(int i = nr; i<= 100; i++){
//        sum +=i;
//        totalnr++;
//    }
//    double media = (double)sum/totalnr;
//    System.out.println("Media = " + media);
//}}

//Ex nr.9
//var 1
//public void printStars(int n){
//
//for(int i = 1; i<=n; i++){
//    System.out.print("*");
//}
//    System.out.println();
//}
//
//public void printPattern(int n){
//    for(int i = n; i>0;i--){
//        printStars(i);
//    }
//}
    //var 2


    public void printPattern(int n){
        for(int i = n; i>0;i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }





}





















