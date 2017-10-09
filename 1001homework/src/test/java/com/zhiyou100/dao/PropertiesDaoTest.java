package com.zhiyou100.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.model.Properties;
import com.zhiyou100.vo.PageVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PropertiesDaoTest {
	@Autowired
	private PropertiesDao dao;

	@Test
	public void testAddProperties() {
		Properties properties = new Properties(null, null, null, null, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 1);
		dao.addProperties(properties);
	}

	@Test
	public void testGetListCount() {
		int result = dao.getListCount();
		System.out.println(result);
	}

	@Test
	public void testListProperties() {
		PageVo pageVo = new PageVo();
		pageVo.setPageIndex(1);
		pageVo.setPageSize(10);
		List<Properties> list = dao.listProperties(pageVo);
		for (Properties properties : list) {
			System.out.println(properties);
		}
	}

	@Test
	public void testListPropertiesByLevelUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPropertiesByLevelDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPropertiesByTimeUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPropertiesByTimeDown() {
		fail("Not yet implemented");
	}

}
