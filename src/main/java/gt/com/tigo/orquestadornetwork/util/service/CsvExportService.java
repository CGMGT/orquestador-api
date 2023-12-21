package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.dto.DataTableRequestDto;
import gt.com.tigo.orquestadornetwork.dto.ResourceDto;
import gt.com.tigo.orquestadornetwork.util.exception.InvalidFilterException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourcesNotFoundException;

import java.io.IOException;

public interface CsvExportService {

    ResourceDto exportCsv(DataTableRequestDto dataTableRequestDto) throws ResourcesNotFoundException, InvalidFilterException, IOException;

}
