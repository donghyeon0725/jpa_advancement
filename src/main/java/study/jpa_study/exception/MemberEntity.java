package study.jpa_study.exception;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long id;

}
