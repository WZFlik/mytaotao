package com.mytaotao.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytaotao.manage.mapper.ItemCatMapper;
import com.mytaotao.manage.pojo.Item;
import com.mytaotao.manage.pojo.ItemCat;

@Service
public class ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;

	/**
	 * 根据parentId查找商品类目列表
	 * @param pid
	 * @return
	 */
	public List<ItemCat> quaryItemCatListByParentId(long pid) {
		ItemCat record = new ItemCat();
		record.setParentId(pid);//查询条件
		return this.itemCatMapper.select(record);
	}

}
