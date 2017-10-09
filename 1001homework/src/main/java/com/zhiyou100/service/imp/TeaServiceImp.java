package com.zhiyou100.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaDao;
import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;

@Service
public class TeaServiceImp implements TeaService {
	@Autowired
	private TeaDao dao;

	public void voteForTea(Tea tea) {
		dao.voteForTea(tea);
	}

}
