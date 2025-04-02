package com.dao;

import com.entity.XuexifenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexifenxiVO;
import com.entity.view.XuexifenxiView;


/**
 * 学习分析
 * 
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
public interface XuexifenxiDao extends BaseMapper<XuexifenxiEntity> {
	
	List<XuexifenxiVO> selectListVO(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);
	
	XuexifenxiVO selectVO(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);
	
	List<XuexifenxiView> selectListView(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);

	List<XuexifenxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexifenxiEntity> wrapper);

	
	XuexifenxiView selectView(@Param("ew") Wrapper<XuexifenxiEntity> wrapper);
	

}
