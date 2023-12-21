package gt.com.tigo.orquestadornetwork.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class NativeQueryRepository<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public List<T> executeNativeQuery(String queryString) {
        Query query = this.entityManager.createNativeQuery(queryString);

        return query.getResultList();
    }

}
