package com.dummy.app.entity.dummy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepo extends JpaRepository<DummyDO, Integer> {
}
