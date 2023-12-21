package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.util.exception.ResourceNotFoundException;

public interface FindByIdService<T> {

    T findById(Long id) throws ResourceNotFoundException;

}
