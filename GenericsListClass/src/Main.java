import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        liste.add(40);
        liste.add(20);
        liste.add(35);
        liste.add(65);
        liste.add(20);
        System.out.println("Dizinin kapasitesi: "+liste.getCapacity());
        System.out.println("Dizinin eleman sayısı: "+liste.getSize());
        System.out.println(liste.getArr()[0]); //dizinin ilk elemanı.
        liste.get(2);
        liste.remove(2);
        liste.get(2);
        liste.set(2, 100);
        liste.get(2);
        System.out.println(liste.toString());
        System.out.println(liste.indexOf(20));
        System.out.println(liste.lastIndexOf(20));
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        liste.clear();
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        System.out.println(liste.toString());
        System.out.println(liste.contains(54) ? "İçerir" : "İçermez");
        Object[] objArr = liste.toArray();
        System.out.println(objArr[0]);
    }
}
