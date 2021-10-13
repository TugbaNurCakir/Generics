public class Main {
    public static void main(String[] args) {
        String[] a = {"tugba","nur","cakir"};
        Integer[] b = {2,1,1,0};
        Character[] c = {'J','a','v','a'};

        /*
        //Genericleri kullanmazsam bunları yazdırmak için 3 ayrı döngü kurmam lazım. Çünkü veri tipleri farklı.
        for(String i: a){
            System.out.println(i);
        }
        for(Integer i: b){
            System.out.println(i);
        }
        for(Character i: c){
            System.out.println(i);
        }
        //Genericleri kullanırsam bunları tek döngü ile yapabilirim.

         */
        //tek metodla hallettim.
        printSingleMethod.printArray(a);
        printSingleMethod.printArray(b);
        printSingleMethod.printArray(c); //eğer iki tane birden yazdırmak istiyorsak (c, a) gibi metodda da parametre olarak girip ikinci döngüyü yazmak lazım.
    }
}
