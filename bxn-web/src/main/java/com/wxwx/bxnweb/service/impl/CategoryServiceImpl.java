package com.wxwx.bxnweb.service.impl;

import com.wxwx.bxnweb.entity.Category;
import com.wxwx.bxnweb.mapper.CategoryMapper;
import com.wxwx.bxnweb.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
