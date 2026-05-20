package cas08.zadatak04;

import java.util.Optional;

public interface Stek<T> {
    void push(T element);
    void pop();
    Optional<T> top();
    boolean empty();
}
