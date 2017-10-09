package com.zhiyou100.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.PropertiesDao;
import com.zhiyou100.model.Properties;
import com.zhiyou100.service.PropertiesService;
import com.zhiyou100.util.PageInfo;
import com.zhiyou100.vo.PageVo;

@Service
public class PropertiesServiceImp implements PropertiesService {
	@Autowired
	private PropertiesDao dao;

	public void addProperties(Properties properties) {
		dao.addProperties(properties);
	}

	public PageInfo<Properties> listTea(PageVo pageVo) {
		int pageIndex = pageVo.getPageIndex();
		int n = pageVo.getPageSize();
		int m = dao.getListCount();
		int pageCount = (m + n - 1) / n;
		if (pageIndex > pageCount) {
			pageIndex = pageCount;
			pageVo.setPageIndex(pageIndex);
		}
		if (pageIndex < 1) {
			pageVo.setPageIndex(1);
		}
		List<Properties> list = dao.listProperties(pageVo);
		PageInfo<Properties> pageInfo = new PageInfo<Properties>(pageIndex, m, list);
		return pageInfo;
	}

	public PageInfo<Properties> listPropertiesByLevelUp(PageVo pageVo) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<Properties> listPropertiesByLevelDown(PageVo pageVo) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<Properties> listPropertiesByTimeUp(PageVo pageVo) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<Properties> listPropertiesByTimeDown(PageVo pageVo) {
		// TODO Auto-generated method stub
		return null;
	}

}
