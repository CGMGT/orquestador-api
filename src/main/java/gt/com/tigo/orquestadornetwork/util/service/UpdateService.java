package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.util.exception.RequesterNotFoundException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourceUpdateException;

public interface UpdateService<T> {

    T update(T entity, Long requesterId) throws RequesterNotFoundException, ResourceUpdateException;

}
