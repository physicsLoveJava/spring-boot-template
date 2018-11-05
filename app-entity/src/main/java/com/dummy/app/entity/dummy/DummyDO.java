package com.dummy.app.entity.dummy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dummy")
@Data
public class DummyDO {

    @Id
    private Integer id;

    @Column
    private String name;

}
