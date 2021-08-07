package study.jpa_study.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Config {

    /*@Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new CustomPersistenceExceptionTranslationPostProcessor();
    }*/
}
