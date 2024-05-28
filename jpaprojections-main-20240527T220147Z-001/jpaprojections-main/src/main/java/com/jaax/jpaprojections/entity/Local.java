package com.jaax.jpaprojections.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "tbl_local")
public class Local {

    @Id
    @Column(name = "id_local")
    private Long id;
    private String name;
    private String floor;

}
