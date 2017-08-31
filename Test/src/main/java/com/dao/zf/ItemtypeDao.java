package com.dao.zf;

import java.util.List;

import com.entity.Itemtype;

/** 
 * @author 作者 :郑飞 
 * @version 创建时间：2017年8月31日 上午10:49:20 
 * 类说明  对项目类型的操作
 */ 

public interface ItemtypeDao {
	/**
	 * 查询所有的项目类型
	 * @return 项目类型的链表
	 */
	public List<Itemtype> getItemtypes();

	/**
	 * 添加一个新的项目类型
	 * @param itemtype项目类型
	 * @return
	 */
	public int addItemtype(Itemtype itemtype);
}
