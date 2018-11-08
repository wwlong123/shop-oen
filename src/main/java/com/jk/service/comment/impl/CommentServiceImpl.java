package com.jk.service.comment.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.comment.CommentDao;
import com.jk.model.comment.Comment;
import com.jk.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl  implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public void SaveComment(Comment comment) {
          comment.setComDate(new Date());
        commentDao.SaveComment(comment);
        commentDao.updateCount(comment);
    }

    @Override
    public List<Comment> selectComment(Comment comment) {

        return commentDao.selectComment(comment);
    }
}
