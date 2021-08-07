package study.jpa_study.exception;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

import java.lang.annotation.Annotation;

public class CustomPersistenceExceptionTranslationPostProcessor extends PersistenceExceptionTranslationPostProcessor {
    public CustomPersistenceExceptionTranslationPostProcessor() {
    }

    @Override
    public void setRepositoryAnnotationType(Class<? extends Annotation> repositoryAnnotationType) {
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
    }
}
