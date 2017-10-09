package com.zhiyou100.dao;

import com.zhiyou100.model.Tea;

public interface TeaDao {
	/**
	 * 投票
	 * 
	 * @param tea
	 */
	void voteForTea(Tea tea);
}
