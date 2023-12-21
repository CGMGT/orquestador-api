package gt.com.tigo.orquestadornetwork.util.service;

import gt.com.tigo.orquestadornetwork.dto.DataTableRequestDto;
import gt.com.tigo.orquestadornetwork.util.exception.InvalidFilterException;
import gt.com.tigo.orquestadornetwork.util.exception.ResourcesNotFoundException;
import org.springframework.web.servlet.ModelAndView;

public interface XlsxExportService {

    ModelAndView exportXlsx(DataTableRequestDto dataTableRequestDto) throws ResourcesNotFoundException, InvalidFilterException;

}
