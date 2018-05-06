package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Admin;
import com.hamza.quizapp.entity.Question;
import com.hamza.quizapp.entity.Sujet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Quiz.class)
public class Quiz_ { 

    public static volatile SingularAttribute<Quiz, Admin> idAdmin;
    public static volatile SingularAttribute<Quiz, Integer> idQuiz;
    public static volatile SingularAttribute<Quiz, Date> dateDebut;
    public static volatile SingularAttribute<Quiz, Sujet> idSujet;
    public static volatile SingularAttribute<Quiz, Integer> duree;
    public static volatile SingularAttribute<Quiz, String> nomQuiz;
    public static volatile ListAttribute<Quiz, Question> questionList;

}