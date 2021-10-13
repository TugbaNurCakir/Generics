public class Student<T> implements IDatabase<T>{
 //Bir sınıfın jenerik bir interface'i implemente edebilmesi için jenerik olması gerekir.
    @Override
    public boolean insert(T data) {
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data);
        System.out.println("veri silindi.");
        return false;
    }

    @Override
    public boolean update(T data) {
        return false;
    }

    @Override
    public T select() {
        return null;
    }
}
