package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Properties;
import com.zhiyou100.vo.PageVo;

public interface PropertiesDao {
	/**
	 * 添加属性
	 * 
	 * @param properties
	 */
	void addProperties(Properties properties);

	/**
	 * 查询所有的属性的数量
	 */
	Integer getListCount();

	/**
	 * 查询属性
	 * 
	 * @param pageVo
	 * @return
	 */
	List<Properties> listProperties(PageVo pageVo);

	/**
	 * 查询属性---根据等级升序
	 * 
	 * @param pageVo
	 * @return
	 */
	List<Properties> listPropertiesByLevelUp(PageVo pageVo);

	/**
	 * 查询属性---根据等级降序
	 * 
	 * @param pageVo
	 * @return
	 */
	List<Properties> listPropertiesByLevelDown(PageVo pageVo);

	/**
	 * 查询属性---根据时间升序
	 * 
	 * @param pageVo
	 * @return
	 */
	List<Properties> listPropertiesByTimeUp(PageVo pageVo);

	/**
	 * 查询属性---根据时间降序
	 * 
	 * @param pageVo
	 * @return
	 */
	List<Properties> listPropertiesByTimeDown(PageVo pageVo);
}
