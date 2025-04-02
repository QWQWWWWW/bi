package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexifenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexifenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexifenxiView;


/**
 * 学习分析
 *
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
public interface XuexifenxiService extends IService<XuexifenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexifenxiVO> selectListVO(Wrapper<XuexifenxiEntity> wrapper);
   	
   	XuexifenxiVO selectVO(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);
   	
   	List<XuexifenxiView> selectListView(Wrapper<XuexifenxiEntity> wrapper);
   	
   	XuexifenxiView selectView(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexifenxiEntity> wrapper);

   	

}

