package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexifenxiDao;
import com.entity.XuexifenxiEntity;
import com.service.XuexifenxiService;
import com.entity.vo.XuexifenxiVO;
import com.entity.view.XuexifenxiView;

@Service("xuexifenxiService")
public class XuexifenxiServiceImpl extends ServiceImpl<XuexifenxiDao, XuexifenxiEntity> implements XuexifenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexifenxiEntity> page = this.selectPage(
                new Query<XuexifenxiEntity>(params).getPage(),
                new EntityWrapper<XuexifenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexifenxiEntity> wrapper) {
		  Page<XuexifenxiView> page =new Query<XuexifenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XuexifenxiVO> selectListVO(Wrapper<XuexifenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexifenxiVO selectVO(Wrapper<XuexifenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexifenxiView> selectListView(Wrapper<XuexifenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexifenxiView selectView(Wrapper<XuexifenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
