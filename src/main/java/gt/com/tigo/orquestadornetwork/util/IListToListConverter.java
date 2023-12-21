package gt.com.tigo.orquestadornetwork.util;

import java.util.List;

public interface IListToListConverter<T> {

    List<List<String>> toList(List<T> list);

}
