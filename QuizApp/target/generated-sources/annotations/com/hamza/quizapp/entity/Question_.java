package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Choix;
import com.hamza.quizapp.entity.Quiz;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, String> question;
    public static volatile SingularAttribute<Question, Quiz> idQuiz;
    public static volatile SingularAttribute<Question, Integer> idQuestion;
    public static volatile ListAttribute<Question, Choix> choixList;

}