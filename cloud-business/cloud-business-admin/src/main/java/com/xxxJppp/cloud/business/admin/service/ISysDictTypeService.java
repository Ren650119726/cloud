package com.xxxJppp.cloud.business.admin.service;

import com.xxxJppp.cloud.business.admin.model.SysDictType;
import com.xxxJppp.cloud.common.model.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 字典类型Service
 *
 * @author xxxJppp
 * @date 2020-07-02
 */
public interface ISysDictTypeService extends IService<SysDictType> {
    /**
     * 分页查询
     * @param page
     * @param sysDictType
     * @return
     */
    PageResult<SysDictType> findListByPage(Page<SysDictType> page, SysDictType sysDictType);
}

