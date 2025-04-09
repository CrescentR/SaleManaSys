package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.AgriculturalTask;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2025-04-09
 */
public interface AgriculturalTaskMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public AgriculturalTask selectAgriculturalTaskById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AgriculturalTask> selectAgriculturalTaskList(AgriculturalTask agriculturalTask);

    /**
     * 新增【请填写功能名称】
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 结果
     */
    public int insertAgriculturalTask(AgriculturalTask agriculturalTask);

    /**
     * 修改【请填写功能名称】
     *
     * @param agriculturalTask 【请填写功能名称】
     * @return 结果
     */
    public int updateAgriculturalTask(AgriculturalTask agriculturalTask);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAgriculturalTaskById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAgriculturalTaskByIds(String[] ids);
}
