public class Strings {

    public static void main(String[] vasi) {
        String myString = "i'm vasi ";
        String myString2 = " BICT(Hons),";
        System.out.println(myString + myString2);

        double myDouble = 404.404d;
        char mychr = '\u00A9';

        System.out.println(myString + myDouble);
        System.out.println(myString + mychr + myDouble);

        boolean car = true;
        if (car)
            System.out.println("Audi");


        boolean bike = false;
        if (bike)
            System.out.println("BMW");

        boolean isCar = true;
        if(isCar == false)
            System.out.println("this is not suppose to happen");

       //ternary operator
        boolean wasCar = isCar ? false : true;
        if (wasCar)
            System.out.println("wasCar is false");
        else
            System.out.println("wasCar is true");





    }
}
