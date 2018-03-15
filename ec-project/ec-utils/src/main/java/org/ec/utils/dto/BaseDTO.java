package org.ec.utils.dto;

import org.dozer.Mapper;
import org.ec.utils.BeanMapper;

import java.util.Collection;
import java.util.List;

public class BaseDTO {
    protected final static Mapper mapper = BeanMapper.getMapper();

    public <T> T to(Class<T> target) {
        return mapper.map(this, target);
    }

    public <T> T from(Object target) {
        mapper.map(target, this);
        return (T) this;
    }

    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        return BeanMapper.mapList(sourceList, destinationClass);
    }
}
