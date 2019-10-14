package com.wxwx.bxnweb.service.impl;

import com.wxwx.bxnweb.entity.User;
import com.wxwx.bxnweb.mapper.UserMapper;
import com.wxwx.bxnweb.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
