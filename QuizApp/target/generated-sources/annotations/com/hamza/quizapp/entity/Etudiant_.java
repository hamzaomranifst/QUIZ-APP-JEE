package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Section;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, Section> idSection;
    public static volatile SingularAttribute<Etudiant, String> mdp;
    public static volatile SingularAttribute<Etudiant, String> nom;
    public static volatile SingularAttribute<Etudiant, String> prenom;
    public static volatile SingularAttribute<Etudiant, String> email;
    public static volatile SingularAttribute<Etudiant, Integer> idEtudiant;

}