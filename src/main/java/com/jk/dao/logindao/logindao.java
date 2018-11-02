package com.jk.dao.logindao;

import com.jk.model.Tree;
import com.jk.model.login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface logindao {
    @Select("select * from z_login where username=#{username} and userpas=#{userpas}")
    login selectuser(@Param("username") String username,@Param("userpas") String userpas);

    @Select("select * from z_tree where pid = #{0}")
    List<Tree> selectTree(Integer id);
}
