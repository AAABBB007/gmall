package com.wl.gmalluser.service.impl;

import com.wl.gmalluser.entity.UmsMember;
import com.wl.gmalluser.mapper.UmsMemberMapper;
import com.wl.gmalluser.service.UmsMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员表(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2020-03-24 18:41:41
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper umsMemberMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMember queryById(Long id) {
        return this.umsMemberMapper.queryById(id);
//          return umsMemberMapper.selectById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMember> queryAllByLimit(int offset, int limit) {
        return this.umsMemberMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(UmsMember umsMember) {
        return this.umsMemberMapper.insert(umsMember);
    }

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember update(UmsMember umsMember) {
        this.umsMemberMapper.update(umsMember);
        return this.queryById(umsMember.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberMapper.deleteById(id);
    }
}