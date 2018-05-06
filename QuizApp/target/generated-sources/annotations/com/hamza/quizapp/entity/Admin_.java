package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Quiz;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Integer> idAdmin;
    public static volatile ListAttribute<Admin, Quiz> quizList;
    public static volatile SingularAttribute<Admin, String> mdp;
    public static volatile SingularAttribute<Admin, String> nom;
    public static volatile SingularAttribute<Admin, String> prenom;
    public static volatile SingularAttribute<Admin, String> email;

}