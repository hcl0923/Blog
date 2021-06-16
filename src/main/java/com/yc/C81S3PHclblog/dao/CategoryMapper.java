package com.yc.C81S3PHclblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C81S3PHclblog.bean.Category;

/**
 * 注解(简单sql) + XML(复杂SQL) 配置映射
 * @author 廖彦
 *
 */
public interface CategoryMapper {
	
	@Select("select * from category")
	List<Category> selectAll();
	
	@Select("select * from category where id= #{id}")
	Category selectById(int id);
}
