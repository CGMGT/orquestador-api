package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.util.exception.RequesterNotFoundException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourceCreateException;

public interface CreateService<T> {

    T create(T entity, Long requesterId) throws RequesterNotFoundException, ResourceCreateException;

}
