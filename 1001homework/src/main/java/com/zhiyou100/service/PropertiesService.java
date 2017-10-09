package com.zhiyou100.service;

import com.zhiyou100.model.Properties;
import com.zhiyou100.util.PageInfo;
import com.zhiyou100.vo.PageVo;

public interface PropertiesService {
	/**
	 * 添加属性
	 * 
	 * @param properties
	 */
	void addProperties(Properties properties);

	/**
	 * 查看所有的tea
	 * 
	 * @return
	 */
	PageInfo<Properties> listTea(PageVo pageVo);

	/**
	 * 根据等级升序查询属性
	 * 
	 * @param pageVo
	 * @return
	 */
	PageInfo<Properties> listPropertiesByLevelUp(PageVo pageVo);

	/**
	 * 根据等级降序查询属性
	 * 
	 * @param pageVo
	 * @return
	 */
	PageInfo<Properties> listPropertiesByLevelDown(PageVo pageVo);

	/**
	 * 根据时间升序查询属性
	 * 
	 * @param pageVo
	 * @return
	 */
	PageInfo<Properties> listPropertiesByTimeUp(PageVo pageVo);

	/**
	 * 根据时间降序查询属性
	 * 
	 * @param pageVo
	 * @return
	 */
	PageInfo<Properties> listPropertiesByTimeDown(PageVo pageVo);
}
