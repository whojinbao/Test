package com.entity;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午8:46:12 
* 类说明 
* Iteminfo 项目详情表
*/ 
 
public class Iteminfo {
	private String  itemId ;  //项目编号
	private String   userId ;  //项目发布人的账号
	private String   itemName ;//项目名称
	private String   itemIntro ;//项目简介
	private String   itemContent ;//项目内容
	private String   itemmaterialsurl;//相关材料
	private String   itemTeachar ;//指导教师
	private String   achievement ;//取得成就，评价
	private String   itemMoney ;//项目资金
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemIntro() {
		return itemIntro;
	}
	public void setItemIntro(String itemIntro) {
		this.itemIntro = itemIntro;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemmaterialsurl() {
		return itemmaterialsurl;
	}
	public void setItemmaterialsurl(String itemmaterialsurl) {
		this.itemmaterialsurl = itemmaterialsurl;
	}
	public String getItemTeachar() {
		return itemTeachar;
	}
	public void setItemTeachar(String itemTeachar) {
		this.itemTeachar = itemTeachar;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getItemMoney() {
		return itemMoney;
	}
	public void setItemMoney(String itemMoney) {
		this.itemMoney = itemMoney;
	}
	
}
