package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Choix;
import com.hamza.quizapp.entity.Question;
import com.hamza.quizapp.entity.ReponcePK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Reponce.class)
public class Reponce_ { 

    public static volatile SingularAttribute<Reponce, Question> question;
    public static volatile SingularAttribute<Reponce, ReponcePK> reponcePK;
    public static volatile SingularAttribute<Reponce, Choix> choix;

}