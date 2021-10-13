package generic;

public class Generics {
    public static void main(String[] args) {

        String s;         //undefined bir tanımlamadır.
        String a = null; //Bir değeri var ama içerisi boş.
        String b = "";  // Bir değeri var ama içinde bulunan doluluğun içerisi boş.
        int d = 5;

        Nullable<Integer> num = new Nullable<>(d); //Karşı taraftaki elmasa data type yazmana gerek yok.
        num.run();
    }
}
