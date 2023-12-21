package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.util.exception.ResourcesNotFoundException;

import java.util.List;

public interface FindAllService<T> {

    List<T> findAll() throws ResourcesNotFoundException;

}
