package com.devops.project.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devops.project.business.domain.Message;

import java.util.List;


/**
 * 会话Mapper接口
 *
 * @author chengxiao
 * @date 2022-06-29
 */
public interface MessageMapper extends BaseMapper<Message> {

    /**
     * 查询会话列表
     *
     * @param message 会话
     * @return 会话集合
     */
    List<Message> selectMessageList(Message message);



    /**
     * 批量删除会话
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteMessageByIds(String[] ids);
    }
