package com.cont.service;

import com.cont.model.BillModel;
import com.cont.utils.Page;

public interface BillService {
	public Page<BillModel> selectBill(BillModel vo);
}