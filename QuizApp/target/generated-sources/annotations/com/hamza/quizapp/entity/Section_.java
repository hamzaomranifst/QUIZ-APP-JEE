package com.hamza.quizapp.entity;

import com.hamza.quizapp.entity.Etudiant;
import com.hamza.quizapp.entity.Sujet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T11:45:35")
@StaticMetamodel(Section.class)
public class Section_ { 

    public static volatile SingularAttribute<Section, Integer> idSection;
    public static volatile SingularAttribute<Section, String> libele;
    public static volatile ListAttribute<Section, Sujet> sujetList;
    public static volatile ListAttribute<Section, Etudiant> etudiantList;

}