package com.example.yin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yin.model.domain.Consumer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerMapper extends BaseMapper<Consumer> {


    int insert(Consumer record);

    /**
     * 增加新用户
     * @param record - 用户信息
     * @return int
     */
    int insertSelective(Consumer record);


    int updateByPrimaryKey(Consumer record);

    int verifyPassword(String username, String password);

    int existUsername(String username);


    int updateUserMsg(Consumer record);

    int updateUserAvator(Consumer record);

    int updatePassword(Consumer record);

    int deleteUser(Integer id);

    List<Consumer> allUser();

    List<Consumer> userOfId(Integer id);

    List<Consumer> loginStatus(String username);

}
