package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.dto.CatalogDto;
import gt.com.tigo.orquestadornetwork.util.exception.ResourcesNotFoundException;

import java.util.List;

public interface CatalogService<K, V> {

    List<CatalogDto<K,V>> getDefaultCatalog() throws ResourcesNotFoundException;

}
