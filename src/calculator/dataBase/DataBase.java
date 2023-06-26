package calculator.dataBase;

public interface DataBase<T> {
    DataBase add(T t);

    void getHistory();
}
