package WORK;

import java.util.Collection;
import java.util.Collections;

//UnsupportedOperationException - Попытка выполнения нереализованного метода

public class UnsupportedOperationException {
    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
