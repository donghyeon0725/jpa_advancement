package study.jpa_study.exception;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.NoResultException;

@Repository
public class ExceptionRepository {

    @PersistenceContext
    private EntityManager em;

    public MemberEntity findMember() /*throws NoResultException*/ {
        return em.createQuery("select m from MemberEntity m", MemberEntity.class).getSingleResult();
    }
}
