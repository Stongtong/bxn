package com.wxwx.bxnweb.service.impl;

import com.wxwx.bxnweb.entity.Comment;
import com.wxwx.bxnweb.mapper.CommentMapper;
import com.wxwx.bxnweb.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wxt
 * @since 2019-10-13
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
