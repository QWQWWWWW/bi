package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuexifenxiEntity;
import com.entity.view.XuexifenxiView;

import com.service.XuexifenxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习分析
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-31 16:31:54
 */
@RestController
@RequestMapping("/xuexifenxi")
public class XuexifenxiController {
    @Autowired
    private XuexifenxiService xuexifenxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexifenxiEntity xuexifenxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xuexifenxi.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xuexifenxi.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuexifenxiEntity> ew = new EntityWrapper<XuexifenxiEntity>();

		PageUtils page = xuexifenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexifenxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexifenxiEntity xuexifenxi, 
		HttpServletRequest request){
        EntityWrapper<XuexifenxiEntity> ew = new EntityWrapper<XuexifenxiEntity>();

		PageUtils page = xuexifenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexifenxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexifenxiEntity xuexifenxi){
       	EntityWrapper<XuexifenxiEntity> ew = new EntityWrapper<XuexifenxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexifenxi, "xuexifenxi")); 
        return R.ok().put("data", xuexifenxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexifenxiEntity xuexifenxi){
        EntityWrapper< XuexifenxiEntity> ew = new EntityWrapper< XuexifenxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexifenxi, "xuexifenxi")); 
		XuexifenxiView xuexifenxiView =  xuexifenxiService.selectView(ew);
		return R.ok("查询学习分析成功").put("data", xuexifenxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexifenxiEntity xuexifenxi = xuexifenxiService.selectById(id);
        return R.ok().put("data", xuexifenxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexifenxiEntity xuexifenxi = xuexifenxiService.selectById(id);
        return R.ok().put("data", xuexifenxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexifenxiEntity xuexifenxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexifenxi);
        xuexifenxiService.insert(xuexifenxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexifenxiEntity xuexifenxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexifenxi);
        xuexifenxiService.insert(xuexifenxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexifenxiEntity xuexifenxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexifenxi);
        xuexifenxiService.updateById(xuexifenxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexifenxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
