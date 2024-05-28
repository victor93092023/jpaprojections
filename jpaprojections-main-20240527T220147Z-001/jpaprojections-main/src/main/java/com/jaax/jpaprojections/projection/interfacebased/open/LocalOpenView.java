package com.jaax.jpaprojections.projection.interfacebased.open;

import org.springframework.beans.factory.annotation.Value;

public interface LocalOpenView {

    @Value("#{target.name + ' ' + target.floor}")
    String getNameAndFloor();

}
