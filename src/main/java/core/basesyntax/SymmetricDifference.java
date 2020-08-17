package core.basesyntax;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet();
        set3.addAll(unique(set1, set2));
        set3.addAll(unique(set2, set1));
        return set3;
    }

    public Set<T> unique(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setToReurn = new HashSet();
        for (T set1object : set1) {
            if (!set2.contains(set1object)) {
                setToReurn.add(set1object);
            }
        }
        return setToReurn;
    }
}
