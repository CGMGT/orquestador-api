package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.AdmUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AdmUsuarioEntity, Long>, JpaSpecificationExecutor<AdmUsuarioEntity> {

    AdmUsuarioEntity findByUuid(String uuid);
    AdmUsuarioEntity findByCorreoElectronico(String correoElectronico);

}
