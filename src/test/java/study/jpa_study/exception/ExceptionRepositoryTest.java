package study.jpa_study.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ExceptionRepositoryTest {

    @Autowired
    private ExceptionRepository exceptionRepository;

    @Test
    @DisplayName("예외 변환기 테스트")
    public void exceptionTest() {
        exceptionRepository.findMember();
    }
}
