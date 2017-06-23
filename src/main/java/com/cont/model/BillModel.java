package com.cont.model;

import com.cont.utils.SuperModel;

public class BillModel extends SuperModel{
	private long  id;
	private String bill_no;
	private String status;
	private long cus_id;
	private String cus_cname;
	private String cus_name;
	private String u_weixin;
	private String startDate;
	private String endDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getCus_id() {
		return cus_id;
	}
	public void setCus_id(long cus_id) {
		this.cus_id = cus_id;
	}
	public String getCus_cname() {
		return cus_cname;
	}
	public void setCus_cname(String cus_cname) {
		this.cus_cname = cus_cname;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public String getU_weixin() {
		return u_weixin;
	}
	public void setU_weixin(String u_weixin) {
		this.u_weixin = u_weixin;
	}
}
