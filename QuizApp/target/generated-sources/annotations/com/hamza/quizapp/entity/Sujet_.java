package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Quiz;
import com.hamza.quizapp.entity.Section;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Sujet.class)
public class Sujet_ { 

    public static volatile ListAttribute<Sujet, Quiz> quizList;
    public static volatile SingularAttribute<Sujet, Section> idSection;
    public static volatile SingularAttribute<Sujet, Integer> idSujet;
    public static volatile SingularAttribute<Sujet, String> libele;

}