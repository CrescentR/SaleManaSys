package com.ruoyi.system.service;
import java.util.List;
import com.ruoyi.system.domain.AgriculturalTask;


public interface IAgriculturalTaskService {
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
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAgriculturalTaskByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAgriculturalTaskById(String id);
}
