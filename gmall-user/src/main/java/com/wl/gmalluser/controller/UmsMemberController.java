package com.wl.gmalluser.controller;

import com.wl.gmalluser.entity.UmsMember;
import com.wl.gmalluser.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员表(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-03-24 18:41:41
 */
@RestController
@RequestMapping("/")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(@RequestParam(name = "id") Long id) {
        return this.umsMemberService.queryById(id);
    }

}