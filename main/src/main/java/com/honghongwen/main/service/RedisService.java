package com.honghongwen.main.service;

/**
 * @author fengwen
 * @date 2020-12-25
 * 常用redis操作
 */
public interface RedisService {

    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置过期时间
     * @return
     */
    Boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
