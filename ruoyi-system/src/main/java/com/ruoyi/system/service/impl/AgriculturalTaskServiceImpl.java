package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AgriculturalTaskMapper;
import com.ruoyi.system.domain.AgriculturalTask;
import com.ruoyi.system.service.IAgriculturalTaskService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2025-04-09
 */
@Service
public class AgriculturalTaskServiceImpl implements IAgriculturalTaskService
{
    @Autowired
    private AgriculturalTaskMapper agriculturalTaskMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public AgriculturalTask selectAgriculturalTaskById(String id)
    {
        return agriculturalTaskMapper.selectAgriculturalTaskById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AgriculturalTask> selectAgriculturalTaskList(AgriculturalTask agriculturalTask)
    {
        return agriculturalTaskMapper.selectAgriculturalTaskList(agriculturalTask);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAgriculturalTask(AgriculturalTask agriculturalTask)
    {
        return agriculturalTaskMapper.insertAgriculturalTask(agriculturalTask);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAgriculturalTask(AgriculturalTask agriculturalTask)
    {
        return agriculturalTaskMapper.updateAgriculturalTask(agriculturalTask);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAgriculturalTaskByIds(String[] ids)
    {
        return agriculturalTaskMapper.deleteAgriculturalTaskByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAgriculturalTaskById(String id)
    {
        return agriculturalTaskMapper.deleteAgriculturalTaskById(id);
    }
}
