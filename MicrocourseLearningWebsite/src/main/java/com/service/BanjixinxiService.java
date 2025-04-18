package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixinxiView;


/**
 * 班级信息
 *
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
public interface BanjixinxiService extends IService<BanjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjixinxiVO> selectListVO(Wrapper<BanjixinxiEntity> wrapper);
   	
   	BanjixinxiVO selectVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
   	
   	List<BanjixinxiView> selectListView(Wrapper<BanjixinxiEntity> wrapper);
   	
   	BanjixinxiView selectView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjixinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<BanjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<BanjixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<BanjixinxiEntity> wrapper);



}

