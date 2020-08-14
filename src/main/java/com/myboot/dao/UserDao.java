package com.myboot.dao;

import com.myboot.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author fstar
 */
@Repository
public interface UserDao {
    /**
     *
     * @param user 用户
     * @return
     */
    int add(User user);

    int updateById(User user);

    int deleteById(@Param("id") Integer id);

    User selectById(@Param("id") Integer id);
}
