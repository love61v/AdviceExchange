package com.dozortsev.adviceexchange.service;

import com.dozortsev.adviceexchange.domain.AbstractEntity;

import java.io.Serializable;

public interface GenericService<ID extends Serializable, T extends AbstractEntity<ID>> {

    public ID create(T entity);

    public void delete(T entity);

    public void deleteById(ID id);

    public T findById(ID id);

    public T update(T entity);
}