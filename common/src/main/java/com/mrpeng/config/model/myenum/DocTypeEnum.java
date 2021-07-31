package com.mrpeng.config.model.myenum;


import org.apache.commons.lang3.StringUtils;

/**
 * 单据类型枚举
 * @author: pqq
 * @create: 2021-01-06 11:28
 **/
public enum  DocTypeEnum {

    BILL_OF_LADING("H101","要货单"),
    DELIVERY_RECEIPT("H501","配送入库单"),
    RETURN_APPLICATION("H701","退配申请单"),
    DISTRIBUTION_RETURN_DELIVERY("H801","退配出库单"),
    POS_SALES_LIST("A001","POS销售单"),
    POS_ORDER("A002","POS订单"),
    PRICE_MAINTENANCE_SHEET("A101","售价维护单"),
    TEMPORARY_SPECIAL_PRICE_LIST("A201","临时特价单"),
    INVENTORY_TASK_LIST("A301","盘点任务单"),
    INVENTORY_ENTRY_SHEET("A401","盘点录入单"),
    INVENTORY_PROFIT_AND_LOSS_SHEET("A501","盘点盈亏单"),
    DAMAGE_REPORT("A601","报损单"),
    LOSS_REPORT("A701","报失单"),
    INVENTORY_ADJUSTMENT_DOCUMENT("A801","库存调整单"),


    ENC("411","ENC"),
    REGULAR_PRODUCT_WORK_ORDER("511","常规产品工单","02AD0ACB-29D0-4F28-9471-15E25993C88E"),
    REPEAT_WORK_ORDER("531","重工工单","500C406D-5509-4C78-0284-15EE4021BF7E"),
    MANUAL_REQUISITION("312","手工请购单"),
    REGULAR_PRODUCT_ORDER("231","常规产品订单","BCDD7C0F-B405-4AE8-78FD-15EE29EF3AE3"),
    PLANNING_REQUISITION("311","计划请购单"),
    PURCHASE_ORDER("351","采购订单"),
    PURCHASE_RECEIPT("121","采购入库单"),
    PURCHASE_ARRIVAL("371","采购到货单"),
    PURCHASE_RETURN_DELIVERY_ORDER("131","采购退货出库单"),
    PURCHASE_RETURN("3A1","采购退货单"),
    BILLING_SALES_DELIVERY_ORDER("141","开帐销货出库单"),
    SALES_ORDER("251","销货单"),
    MISCELLANEOUS_RECEIPT("113","杂项入库单"),
    INVENTORY_TRANSFER("161","库存调拨单"),
    SCRAP_LIST("1F1","报废单"),
    INVENTORY_PROFIT_SHEET("1G1","盘盈单"),
    URGENT_ORDER_PICKING_LIST("563","急单领料单","24E33FA7-FDAB-4586-7CDD-15EE4067A62F"),
    PRICE_DIFFERENCE_ADJUSTMENT_SHEET("1H1","价差调整单"),
    SALES_RETURN_RECEIPT("151","销退入库单"),
    SALES_REFUND("271","销退单"),
    PRODUCTION_FEE_AND_MATERIAL_REQUISITION("111","制费领料单"),
    R_AND_D_MATERIAL_REQUISITION("112","研发领料单"),
    INVENTORY_LOSS_SHEET("1G2","盘亏单"),
    INVENTORY_BILLING("1H9","库存开账单"),
    ADJUSTMENT_SHEET_OF_BRANCH_STOCK_TAIL_DIFF("1H2","分库尾差调整单"),
    EMERGENCY_WORK_ORDER("512","紧急工作单","14504B51-0D1A-4D1E-FD39-15EE3FFAA266"),
    MATERIAL_REQUISITION("561","领料单","E2647ADB-D49E-4718-1353-15EE4031D113"),
    SUPER_ORDER("562","超领单","D683CA1B-843B-4083-15FB-15EE4055204A"),
    PRODUCTION_COST_ADJUSTMENT_SHEET("1K1","生产成本调整单"),
    MATERIAL_RETURN_SHEET("571","退料单"),
    PRODUCTION_RECEIPT("5A1","生产入库单","331A1C51-F756-4544-E00B-15EE409C8869"),
    A_R_DOCUMENT("611","应收单"),
    RECEIPT("631","收款单"),
    REMITTANCE_FORM("651","调汇单"),
    A_P_SHEET("711","应付单"),
    PAYMENT("741","付款单"),
    ESTIMATION_SHEET("7B1","暂估单"),
    BILLING_SALES_ORDER("239","开帐销售单"),
    WRITE_OUT_SALES_ORDER("2G1","开账销货单"),
    BILL_OF_ARRIVAL("3E1","开账到货单"),
    OPEN_PURCHASE_ORDER("359","开账采购订单"),
    OUTSOURCING_SALES_ORDER("232","外协销售订单"),
    FREE_ORDER("233","免费订单"),
    OUTSOURCING_WORK_ORDER("513","委外工单","3FB1A6B4-4397-4122-3760-16044F542703"),
    OPEN_OUTSOURCING_ORDER("238","开账外协订单"),
    BOOKKEEPING_VOUCHER("911","记账凭证"),
    A_R_WRITE_OFF_DOCUMENT("671","应收转销单"),
    OUTSOURCING_REPAIR_ORDER("234","外协维修品订单"),
    OUTSOURCING_FREE_ORDER("230","外协免费订单"),
    RAILWAY_PROJECT_SALES_ORDER("221","铁路项目销售订单"),
    LEAK_REPAIR_WORK_ORDER("551","补漏工时工单"),
    PROFIT_AND_LOSS_CARRY_FORWARD_VOUCHER("912","损益结转凭证"),
    INTERNAL_PRE_ORDER("223","内部预投订单"),
    FIELD_SERVICE_SALES_ORDER("224","现场服务销售订单"),
    REVENUE_AND_EXPENDITURE("K301","收支"),
    CURRENT_RECEIPT("6302","收款单（往来）"),
    AMORTIZATION_BILL_OF_LADING("I01","资产摊提单"),
    A_P_TRANSFER_ORDER("761","应付转销单"),
    SALES_DELIVERY_ORDER("142","销货出库单"),
    ESTIMATED_OFFSET_VOUCHER("9301","暂估冲回凭证"),
    COST_ADJUSTMENT("1H06","调账（制费）"),
    OUTSOURCING_PURCHASE_ORDER("6302","采购订单（委外）"),
    ASSET_ADJUSTMENT_DOCUMENT("I201","资产调整单"),
    OTHER_A_AND_R_DOCUMENTS("621","其他应收单"),
    CURRENT_PAYMENT_FORM("742","付款单（往来）"),
    CUSTOMER_SUPPLY_WAREHOUSING("116","客供料入库"),
    CUSTOMER_SUPPLY_AND_MATERIAL_DELIVERY("117","客供料出库"),
    PRODUCT_NUM_CONVERSION_ISSUE("119","品号转换出库"),
    CLAIM_FORM("241","索赔单"),
    NEW_PRODUCT_ORDER("235","新产品订单"),
    SERVICE_ORDER("236","服务订单"),
    REPAIR_ORDER("237","维修品订单"),
    INTERNAL_EXPENSE_AND_LOSS_SHEET("242","内部费损单"),
    INTERNAL_EQUIPMENT_MAINTENANCE("222","内部设备维修，工装"),
    MISCELLANEOUS_DELIVERY_ORDER("114","杂项出库单"),
    ACCOUNT_RECEIVABLE("619","开帐应收单"),
    ACCOUNT_OPENING_AND_RECEIPT("639","开账收款单"),
    ACCOUNT_OPENING_AND_A_P("719","开账应付单"),
    BILLING_AND_PAYMENT("749","开账付款单"),
    ACQUISITION_ORDER("I1","取得单"),
    PRODUCT_NUM_CONVERSION_WAREHOUSING("118","品号转换入库"),
    DISASSEMBLY_WORK_ORDER("5401","拆件工单"),
    COPE_WITH("712","应付（主营业务成本）"),
    CARRY_FORWARD_OF_MANUFACTURING_EXPENSES("913","制造费用结转"),
    INTERNAL_WASTE_WORK_ORDER("515","内部废损工单"),
    OUTSOURCING_PURCHASE_ARRIVAL("372","委外采购到货单"),
    REFUND_FORM_PAYABLE("7501","应付退款单"),
    PRE_ORDER_OF_CONVENTIONAL_PRODUCTS("516","预投常规产品工单","F15DD0F9-0312-4527-983D-166E3314BF1C"),
    SUPPLIER_COMMISSIONED_PRODUCTION("225","供应商委托生产"),
    COST_ADJUSTMENT_SHEET("1H03","成本调整单"),
    URGENT_MATERIAL_RETURN("572","急单料退料单"),
    RESERVATION_FORM("1D1","保留单"),
    RELEASE_SHEET("1E1","释出单"),
    ACCOUNT_ADJUSTMENT("115","调账用"),
    COST_ADJUSTMENT_S("IH05","成本调整（S）"),

    ADVANCE_PURCHASE_ORDER("353","预投采购订单"),
    INTERNAL_WASTE_HEAVY_WORK_ORDER("514","内部废损工单（重工）"),
    REFUND_FORM_RECEIVABLE("641","应收退款单"),
    YUNSHENG_REGULAR_PRODUCT_ORDER("517","云盛常规产品订单","DC372C27-FD3D-4E8A-3523-16FA070DC406"),
    CUSTOMER_CLAIMS("713","客户索赔"),
    TRANSACTION_REVERSAL_SHEET("6601","往来冲账单"),

    LOGISTICS_LIST("WL","物流单"),

    ROUT_INSPECTION("ZJ","工艺质检单"),

    ARRIVAL_INSPECTION("521","到货质检单"),

    PICK_OUTBOUND("112","领料出库单"),

    FEEDBACK("FB","反馈单"),

    INNER_ISSUE("811","内部发料单","1C25C059-49F3-4180-8052-6B58B11BB107");



    private String type;
    private String name;
    private String id;

    DocTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    DocTypeEnum(String type, String name,String id) {
        this.type = type;
        this.name = name;
        this.id =id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     * 匹配单据类型根据ID，并返回类型
     * @author pengquan
     * @date 2021/5/28 11:17
     * @param docId 单据ID
     * @return com.yuansheng.common.model.myenum.DocTypeEnum
     */
    public static DocTypeEnum matchTypeById(String docId){
        if(StringUtils.isBlank(docId)){
            return null;
        }
        for (DocTypeEnum value : DocTypeEnum.values()) {
            if(docId.equals(value.getId())){
                return value;
            }
        }
        return null;
    }
}
