package com.wl.gmalluser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wl.gmalluser.entity.UmsMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberMapper extends BaseMapper<UmsMember> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMember queryById(@Param("id") Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMember> queryAllByLimit(@Param("offset")int offset, @Param("limit")int limit);

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    int insert(@Param("umsMember")UmsMember umsMember);

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    void update(@Param("umsMember")UmsMember umsMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(@Param("id")Long id);
}
