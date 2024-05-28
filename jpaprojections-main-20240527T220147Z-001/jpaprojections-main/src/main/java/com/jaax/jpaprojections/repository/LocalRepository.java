package com.jaax.jpaprojections.repository;

import com.jaax.jpaprojections.entity.Local;
import com.jaax.jpaprojections.projection.interfacebased.open.LocalOpenView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {

    List<LocalOpenView> findBy();

}
