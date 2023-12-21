package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.AdmParametroInternalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationParameterInternalRepository extends JpaRepository<AdmParametroInternalEntity, Long>, JpaSpecificationExecutor<AdmParametroInternalEntity> {
}
