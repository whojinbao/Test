package com.service.zf;

import com.entity.Personinfo;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月31日 上午11:12:34 
* 类说明  个人信息表的操作
*/ 
 
public interface PersoninfoService {
	/**
	 * addPersoninfo : 添加一个人的个人信息
	 * @param personinfo
	 * @return
	 */
    public int addPersoninfo(Personinfo personinfo);
    /**
     * selectPerson : 查询单个人的个人信息
     * @param userId 账号
     * @return 个人信息
     */
    public Personinfo selectPerson(String userId);
}
