package com.teamdev.chat.repository;

public interface CRUDRepository<Entity> {
        Entity findOne(long id);
        Iterable<Entity> findAll();
        void save(Entity entity);
        void delete(long id);
}
