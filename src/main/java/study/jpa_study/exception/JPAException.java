package study.jpa_study.exception;

import org.springframework.dao.*;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.orm.jpa.JpaOptimisticLockingFailureException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.transaction.TransactionSystemException;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.OptimisticLockException;
import javax.persistence.PessimisticLockException;
import javax.persistence.RollbackException;
import javax.persistence.TransactionRequiredException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.LockTimeoutException;
import javax.persistence.QueryTimeoutException;

public class JPAException {
    public static void main(String[] args) {
        try {
            // JPA 예외
            if (true)
                throw new EntityExistsException();
            if (true)
                throw new EntityNotFoundException();
            if (true)
                throw new OptimisticLockException();
            if (true)
                throw new PessimisticLockException();
            if (true)
                throw new RollbackException();
            if (true)
                throw new TransactionRequiredException();
            if (true)
                throw new NoResultException();
            if (true)
                throw new NonUniqueResultException();
            if (true)
                throw new LockTimeoutException();
            if (true)
                throw new QueryTimeoutException();


        } catch (Exception e) {

        }
    }
}
