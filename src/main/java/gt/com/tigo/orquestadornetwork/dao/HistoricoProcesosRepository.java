package gt.com.tigo.orquestadornetwork.dao;

import gt.com.tigo.orquestadornetwork.model.HistoricoProcesosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoProcesosRepository extends JpaRepository<HistoricoProcesosEntity, Long>, JpaSpecificationExecutor<HistoricoProcesosEntity> {
}
