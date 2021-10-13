package generic; //Genericler ilkel veri tipleri ile değil, kendi oluşturduğu ya da wrapper türündeki değişkenlerle çalışmaktadır.

public class Nullable <T> { //sınıfa bir parametre veriyoruz. veri tiplerini ifade eder.
    private final T value;

    public Nullable(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        return this.getValue()==null;
    }
    public void run(){
        if(isNull()){
            System.out.println("Bu değişken null dir.");
        }
        else{
            System.out.println(this.value);
        }
    }

}
