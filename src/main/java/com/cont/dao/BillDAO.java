package com.cont.dao;

import java.util.List;

import com.cont.model.BillModel;

public interface BillDAO {
	public List<BillModel> selectAll(BillModel model);
	public int insertBill(BillModel model);
	public int updateByPk(BillModel model);
	public List<BillModel> selectByPage(BillModel model);
	public int selectCount(BillModel model);
	public int deleteByPks(String ids);
	
}
