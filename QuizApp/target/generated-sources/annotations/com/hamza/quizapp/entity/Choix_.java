package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Question;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Choix.class)
public class Choix_ { 

    public static volatile SingularAttribute<Choix, Question> idQuestion;
    public static volatile SingularAttribute<Choix, Integer> idChoix;
    public static volatile SingularAttribute<Choix, String> choix;
    public static volatile SingularAttribute<Choix, Boolean> isCorrect;

}