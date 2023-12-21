package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.WsBitacoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WsBitacoraRepository extends JpaRepository<WsBitacoraEntity, Long>, JpaSpecificationExecutor<WsBitacoraEntity> {

    @Query(
            value = "SELECT pkg_integrador.F_PROCESAR_WO(?1,?2) FROM DUAL",
            nativeQuery = true
    )
    int procesar(String usuario, String idBitacora);

}
