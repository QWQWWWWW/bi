package com.entity.vo;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级信息
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
public class BanjixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 班级号
	 */
	
	private String banjihao;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 班级人数
	 */
	
	private Integer banjirenshu;
		
	/**
	 * 班级介绍
	 */
	
	private String banjijieshao;
		
	/**
	 * 班级图片
	 */
	
	private String banjitupian;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：班级号
	 */
	 
	public void setBanjihao(String banjihao) {
		this.banjihao = banjihao;
	}
	
	/**
	 * 获取：班级号
	 */
	public String getBanjihao() {
		return banjihao;
	}
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(Integer banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public Integer getBanjirenshu() {
		return banjirenshu;
	}
				
	
	/**
	 * 设置：班级介绍
	 */
	 
	public void setBanjijieshao(String banjijieshao) {
		this.banjijieshao = banjijieshao;
	}
	
	/**
	 * 获取：班级介绍
	 */
	public String getBanjijieshao() {
		return banjijieshao;
	}
				
	
	/**
	 * 设置：班级图片
	 */
	 
	public void setBanjitupian(String banjitupian) {
		this.banjitupian = banjitupian;
	}
	
	/**
	 * 获取：班级图片
	 */
	public String getBanjitupian() {
		return banjitupian;
	}
			
}
