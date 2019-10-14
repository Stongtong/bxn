package com.wxwx.bxnweb.service.impl;

import com.wxwx.bxnweb.entity.Post;
import com.wxwx.bxnweb.mapper.PostMapper;
import com.wxwx.bxnweb.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
