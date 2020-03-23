package com.spike.myshop.commons.mapper;

import com.spike.myshop.commons.domain.TbContent;
import com.spike.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbContentMapper extends MyMapper<TbContent> {
}