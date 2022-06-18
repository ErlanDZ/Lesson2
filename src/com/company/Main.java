package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 8;
        int num1 = 80;
        int num2 = -80;
	switch (num){
          case 1:
              System.out.println("num = " + 1);
                break;
          case 88:
              System.out.println("num = " + 88);
              break;

          case 8:
              System.out.println("num = " + 8);
              break;

          case 10:
              System.out.println("num = " + 10);
              break;

          case 808:
              System.out.println("num = " + 808);
              break;

          default:
              System.out.println("num = " + 000);
      }

      if (num > 0 && num1 > 0 || num2 > 0 ){
          System.out.println(num + " " + num1);
      }else {
          System.out.println("0000000000");
      }

//      if (num != 8){
//          System.out.println("true");
//      }else{
//          System.out.println("false");
//      }

      boolean a = true;

      if (!a){
          System.out.println("false");
      }
        System.out.println("Завтрак");
        eda();

        System.out.println("_________________________");

        System.out.println("Обед");
        eda();

        System.out.println("_________________");


        System.out.println("Ужин");
        eda();

        System.out.println(getSquare());
        System.out.println(getSquare1(10, 10));
        System.out.println(getSquare1(150, 310));

        swapFunction("SSD",10, 20);
        swapFunction("et",10, 20);
        swapFunction("etdger",10, 20);

        sayMEOW();
        jump();
    }

    public static void  eda(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public static int getSquare(){
        return 3 * 5;
    }

    public static int getSquare1(int a, int b){
        return a * b;
    }

    public static void swapFunction(String as, int a, int b){
        System.out.println("До Замены: a = " + a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("После Замены: a = " + a + " b = " + b + " " + as);

    }

    public static void sayMEOW(){
        System.out.println("MAY");
    }

    public static void jump(){
        System.out.println("jump-jump");
    }

}
