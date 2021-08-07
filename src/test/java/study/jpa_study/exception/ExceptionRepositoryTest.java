package study.jpa_study.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.jpa.JpaTransactionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;


@SpringBootTest
class ExceptionRepositoryTest {

    @Autowired
    private ExceptionRepository exceptionRepository;

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Test
    @DisplayName("예외 변환기 테스트")
    public void exceptionTest() {
        exceptionRepository.findMember();
    }


    @Test
    @DisplayName("롤백 테스트")
    public void rollbackTest() {

        // EntityManagerFactory 에서 EntityManager 를 얻어 온다.
        EntityManager em = emf.createEntityManager();

        // 트랜젝션을 하나 열었음
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        // 멤버 생성
        MemberEntity member = new MemberEntity();
        member.setName("a");

        // persist 후 변경 => update member_entity set name='b' where id = ?
        em.persist(member);
        member.setName("b");

        // flush 를 호출해서 강제로 SQL 을 날립니다.
        em.flush();

        System.out.println("updated member name is '" + member.getName() + "'");

        transaction.rollback();

        System.out.println("member name after rollback is '" + member.getName() + "'");

    }
}
