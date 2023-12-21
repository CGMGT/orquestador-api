package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.WoMapeosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WoMapeosRepository extends JpaRepository<WoMapeosEntity, Long>, JpaSpecificationExecutor<WoMapeosEntity> {
}
