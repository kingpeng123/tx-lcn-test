package com.mrpeng.config.model.myenum;

/**
 * 任务类型
 * @author: pqq
 * @create: 2021-01-15 10:33
 **/
public enum  TaskType {
    //仓库任务
    INGREDIENTS("ingredients","配料"),
    ISSUE_OUTBOUND("pickOutbound","领料出库"),
    ARRIVED_WAREHOUSE("arrivedWarehouse","运抵仓库"),
    PROCUREMENT_WAREHOUSING("procurementWarehousing","采购入库"),
    PURCHASE_ARRIVAL("purchaseArrival","采购到货"),
    OUTBOUND_SALES("outboundSales","销货出库"),
    SALES("sales","销货单"),
    //物流任务
    WORK_ORDER_PICKING("ISSUE","工单领料"),
    LOGISTICS_TASK("TRANSFER","转移任务"),
    ACCESSORIES_PICKING("ACCESSORIES","辅料领料"),
    MATERIAL_STORAGE("RECEIPT","生产入库"),
    //质检任务
    ROUTING_INSPECTION("ROUT_INSPECT","工序质检"),
    ARRIVAL_INSPECTION("ARRIVAL_INSPECT","到货质检"),

    ALL("all","全部");
    private String type;
    private String comment;

    TaskType(String type,String comment){
        this.type =type;
        this.comment =comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //匹配任务类型
    public static TaskType matchTaskType(String type){
        for (TaskType value : TaskType.values()) {
            if(value.getType().equals(type)){
                return value;
            }
        }
        return null;
    }
}
