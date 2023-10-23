package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.entity.Base;
import com.example.primerExamenv1.repository.BaseRepository;
import com.example.primerExamenv1.service.BaseService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
//@Service
public  class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(E entity, ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E persona = entityOptional.get();
            persona = baseRepository.save(entity);
            return persona;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
