package com.csoftz.ceiba.spring.boot.oracle.entity;

import javax.persistence.*;

@Entity
@Table(name = "MYTABLE")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "in_only_test",
                procedureName = "test_pkg.in_only_test",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "inParam1", type = String.class)
                }),
        @NamedStoredProcedureQuery(name = "in_and_out_test",
                procedureName = "test_pkg.in_and_out_test",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "inParam1", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "outParam1", type = String.class)
                })
})
public class MyTableEntity {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
