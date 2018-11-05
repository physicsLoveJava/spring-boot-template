package com.dummy.app.biz.dummy;

import com.dummy.app.biz.dummy.dto.DummyDTO;

import java.util.List;

public interface DummyService {

    List<DummyDTO> findAll();

    List<DummyDTO> findAll2();
}
