package cn.songmj.kpi.service;


import cn.songmj.kpi.param.KpiContentParam;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author songmj123
 * @since 2018-03-23
 */
public interface KpiContentService {
    /**
     * 分页查询
     *
     * @param kpiContentParam
     * @return
     */
    Page<KpiContentParam> page(KpiContentParam kpiContentParam);

    /**
     * 列表查询
     *
     * @param kpiContentParam
     * @return
     */
    List<KpiContentParam> list(KpiContentParam kpiContentParam);

    /**
     * 保存
     *
     * @param kpiContentParam
     * @return
     */
    Integer save(KpiContentParam kpiContentParam);

    /**
     * 删除
     *
     * @param kcId
     * @return
     */
    Integer delete(Long kcId);
}
