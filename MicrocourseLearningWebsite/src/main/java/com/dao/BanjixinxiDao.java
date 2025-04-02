package com.dao;

import com.entity.BanjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjixinxiVO;
import com.entity.view.BanjixinxiView;


/**
 * 班级信息
 * 
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
public interface BanjixinxiDao extends BaseMapper<BanjixinxiEntity> {
	
	List<BanjixinxiVO> selectListVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
	
	BanjixinxiVO selectVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
	
	List<BanjixinxiView> selectListView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

	List<BanjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

	
	BanjixinxiView selectView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjixinxiEntity> wrapper);



}
