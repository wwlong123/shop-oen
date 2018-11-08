package com.jk.service.comment;

import com.jk.model.comment.Comment;

import java.util.List;

public interface CommentService {
    void SaveComment(Comment comment);
    List<Comment> selectComment(Comment comment);
}
