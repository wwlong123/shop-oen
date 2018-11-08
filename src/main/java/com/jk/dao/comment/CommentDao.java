package com.jk.dao.comment;

import com.jk.model.comment.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CommentDao {
    @Insert("insert into z_comment (uid,bId,comDate,commentName) values(#{comment.uId},#{comment.bId},#{comment.comDate},#{comment.commentName})")
    void SaveComment(@Param("comment") Comment comment);
    @Update("update z_boke set count=count+1 where bid=#{comment.bId}")
    void updateCount(@Param("comment")Comment comment);
    @Select("select * from z_comment c,z_user u  where c.bId=#{comment.bId} and c.uid=u.userid")
    List<Comment> selectComment(@Param("comment")Comment comment);
}
