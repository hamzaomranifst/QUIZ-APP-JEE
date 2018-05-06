package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Etudiant;
import com.hamza.quizapp.entity.PassedQuizPK;
import com.hamza.quizapp.entity.Quiz;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(PassedQuiz.class)
public class PassedQuiz_ { 

    public static volatile SingularAttribute<PassedQuiz, Quiz> quiz;
    public static volatile SingularAttribute<PassedQuiz, Integer> score;
    public static volatile SingularAttribute<PassedQuiz, PassedQuizPK> passedQuizPK;
    public static volatile SingularAttribute<PassedQuiz, Etudiant> etudiant;

}