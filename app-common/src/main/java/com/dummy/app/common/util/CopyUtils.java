package com.dummy.app.common.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CopyUtils {


    public static <S, T> List<T> copyList(
            List<S> sourceList, Class<T> clazz) {
        if(Objects.isNull(sourceList) || sourceList.isEmpty()) {
            return new ArrayList<>();
        }
        List<T> targetList = new ArrayList<>(sourceList.size());
        for (S source : sourceList) {
            T target = BeanUtils.instantiateClass(clazz);
            BeanUtils.copyProperties(source, target);
            targetList.add(target);
        }
        return targetList;
    }
}
