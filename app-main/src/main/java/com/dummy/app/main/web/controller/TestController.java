package com.dummy.app.main.web.controller;

import com.dummy.app.biz.dummy.DummyService;
import com.dummy.app.biz.dummy.dto.DummyDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    DummyService dummyService;

    @GetMapping("/")
    public String root() {
        return "app-backend";
    }

    @GetMapping("/dummy")
    public List<DummyDTO> findDummyList() {
        return dummyService.findAll();
    }

    @GetMapping("/dummy2")
    public List<DummyDTO> findDummyList2() {
        return dummyService.findAll2();
    }

}
