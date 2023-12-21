package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.WoControlStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WoControlStatusRepository extends JpaRepository<WoControlStatusEntity, Long>, JpaSpecificationExecutor<WoControlStatusEntity>  {
}
