package com.jaax.jpaprojections.service;

import com.jaax.jpaprojections.entity.Local;
import com.jaax.jpaprojections.projection.interfacebased.open.LocalOpenView;
import com.jaax.jpaprojections.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService{

    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAll() {
        return repository.findAll();
    }

    @Override
    public List<LocalOpenView> findBy() {
        return repository.findBy();
    }
}
