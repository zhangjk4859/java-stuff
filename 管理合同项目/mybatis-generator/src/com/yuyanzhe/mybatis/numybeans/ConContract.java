package com.yuyanzhe.mybatis.numybeans;

import java.math.BigDecimal;
import java.util.Date;

public class ConContract {
    private Integer id;

    private String mainCode;

    private String mainName;

    private String code;

    private BigDecimal money;

    private String moneyMax;

    private String bankPop;

    private String bankName;

    private String bankCard;

    private String regAddress;

    private Date regDate;

    private Date startDate;

    private Date endDate;

    private String linkeCustomer;

    private String linkeAddress;

    private String linkePhone;

    private String createDate;

    private String createUpdate;

    private String remark;

    private String remark2;

    private String remark3;

    private Integer status;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode == null ? null : mainCode.trim();
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName == null ? null : mainName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMoneyMax() {
        return moneyMax;
    }

    public void setMoneyMax(String moneyMax) {
        this.moneyMax = moneyMax == null ? null : moneyMax.trim();
    }

    public String getBankPop() {
        return bankPop;
    }

    public void setBankPop(String bankPop) {
        this.bankPop = bankPop == null ? null : bankPop.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLinkeCustomer() {
        return linkeCustomer;
    }

    public void setLinkeCustomer(String linkeCustomer) {
        this.linkeCustomer = linkeCustomer == null ? null : linkeCustomer.trim();
    }

    public String getLinkeAddress() {
        return linkeAddress;
    }

    public void setLinkeAddress(String linkeAddress) {
        this.linkeAddress = linkeAddress == null ? null : linkeAddress.trim();
    }

    public String getLinkePhone() {
        return linkePhone;
    }

    public void setLinkePhone(String linkePhone) {
        this.linkePhone = linkePhone == null ? null : linkePhone.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCreateUpdate() {
        return createUpdate;
    }

    public void setCreateUpdate(String createUpdate) {
        this.createUpdate = createUpdate == null ? null : createUpdate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}