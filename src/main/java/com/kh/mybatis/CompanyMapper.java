package com.kh.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper {
    @Insert("INSERT INTO company(company_name, company_address) VALUES (#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("company") Company company);


    @Select("SELECT * FROM company")
    @Results({
            @Result(property = "name", column = "company_name")
            @Result(property = "address", column = "company_address")
    })
    List<Company> getAll(); 888
}
