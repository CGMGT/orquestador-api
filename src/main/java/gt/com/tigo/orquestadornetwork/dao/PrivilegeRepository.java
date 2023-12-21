package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.AdmPermisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<AdmPermisoEntity, Long>, JpaSpecificationExecutor<AdmPermisoEntity> {
}
