package com.entity.view;

import com.entity.XuexifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学习分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
@TableName("xuexifenxi")
public class XuexifenxiView  extends XuexifenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexifenxiView(){
	}
 
 	public XuexifenxiView(XuexifenxiEntity xuexifenxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuexifenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
