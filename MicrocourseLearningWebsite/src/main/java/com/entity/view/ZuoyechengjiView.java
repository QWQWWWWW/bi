package com.entity.view;

import com.entity.ZuoyechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 作业成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
@TableName("zuoyechengji")
public class ZuoyechengjiView  extends ZuoyechengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyechengjiView(){
	}
 
 	public ZuoyechengjiView(ZuoyechengjiEntity zuoyechengjiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyechengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
