package com.dummy.app.biz.dummy.dto;

import com.dummy.app.biz.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DummyDTO extends BaseDTO {

    Integer id;

    String name;
}
