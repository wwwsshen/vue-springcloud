package org.ec.utils;

import org.dozer.Mapper;

public class Entity {
    public <T> T to(Class<T> destinationClass) {
        return BeanMapper.getMapper().map(this, destinationClass);
    }
}
