package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.util.exception.RequesterNotFoundException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourceDeleteException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourceNotFoundException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourceUpdateException;

public interface DeleteByIdService<T> {

    boolean deleteById(Long entityId) throws ResourceDeleteException;

    T deleteById(Long entityId, Long requesterId) throws RequesterNotFoundException, ResourceNotFoundException, ResourceUpdateException;

}
