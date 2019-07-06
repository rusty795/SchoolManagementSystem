package com.learn.app.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name="QUESTION")
public class QuestionEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="QUESTION_KEY", nullable = false)
    private Integer QuestionKey;

    @Column(name="QUESTION_TYPE", nullable = false)
    private String questionType;

    @Column(name="QUESTION_SUBTYPE", nullable = false)
    private String questionSubType;

    @Column(name="SUBJECT_TYPE", nullable = false)
    private String subjectType;

    @Column(name="SUBJECT_SUBTYPE", nullable = false)
    private String subjectSubtype;

    @Lob
    @Column(name="SHORT_DESCRIPTION", nullable = false)
    private String shortDescription;

    @Lob
    @Column(name="LONG_DESCRIPTION")
    private String longDescription;

    @Lob
    @Column(name="OPTIONS", nullable = false)
    private String options;

    @Lob
    @Column(name="SOLUTION", nullable = false)
    private String solution;

    @Column(name="LEVEL",nullable=false)
    private Integer level;

    @CreationTimestamp
    @Column(name = "CREATE_TIMESTAMP")
    private Timestamp createTimestamp;

    @UpdateTimestamp
    @Column(name = "MODIFY_TIMESTAMP")
    private Timestamp modifyTimestamp;

    @Version
    @Column(name = "VERSION")
    private Integer version = 0;

//    @ManyToMany(mappedBy = "TEST_KEY")
//    private List<TestEntity> questionEntities=new ArrayList<>();

}
