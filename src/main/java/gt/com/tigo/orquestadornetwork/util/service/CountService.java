package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.dto.DataTableRequestDto;
import gt.com.tigo.orquestadornetwork.util.exception.InvalidFilterException;

public interface CountService {

    Long count(DataTableRequestDto dataTableRequestDto) throws InvalidFilterException;

}
