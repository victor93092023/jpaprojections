package com.jaax.jpaprojections.controller;

import com.jaax.jpaprojections.entity.Local;
import com.jaax.jpaprojections.projection.interfacebased.open.LocalOpenView;
import com.jaax.jpaprojections.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAll")
    public List<Local> findAll(){
        return localService.findAll();
    }

    // Open View Interface Based
    @GetMapping("/findAllOpenView")
    public List<LocalOpenView> findBy(){
        return localService.findBy();
    }

}
