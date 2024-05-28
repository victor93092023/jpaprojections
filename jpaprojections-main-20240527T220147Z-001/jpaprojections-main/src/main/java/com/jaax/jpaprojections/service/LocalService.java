package com.jaax.jpaprojections.service;

import com.jaax.jpaprojections.entity.Local;
import com.jaax.jpaprojections.projection.interfacebased.open.LocalOpenView;

import java.util.List;

public interface LocalService {
    List<Local> findAll();

    List<LocalOpenView> findBy();


}
