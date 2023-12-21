package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.dto.DataTableRequestDto;
import gt.com.tigo.orquestadornetwork.dto.PaginatedDataDto;
import gt.com.tigo.orquestadornetwork.util.exception.InvalidFilterException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourcesNotFoundException;

public interface FindByPageService<T> {

    PaginatedDataDto<T> findByPage(DataTableRequestDto dataTableRequestDto) throws ResourcesNotFoundException, InvalidFilterException;

}
