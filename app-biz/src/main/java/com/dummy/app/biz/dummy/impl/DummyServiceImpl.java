package com.dummy.app.biz.dummy.impl;

import com.dummy.app.biz.dummy.DummyService;
import com.dummy.app.biz.dummy.dto.DummyDTO;
import com.dummy.app.common.util.CopyUtils;
import com.dummy.app.entity.dummy.DummyMapper;
import com.dummy.app.entity.dummy.DummyRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {

    @Resource
    DummyRepo dummyRepo;

    @Resource
    DummyMapper dummyMapper;

    @Override
    public List<DummyDTO> findAll() {
        return CopyUtils.copyList(dummyRepo.findAll(), DummyDTO.class);
    }

    @Override
    public List<DummyDTO> findAll2() {
        return CopyUtils.copyList(dummyMapper.findAll(), DummyDTO.class);
    }

}
