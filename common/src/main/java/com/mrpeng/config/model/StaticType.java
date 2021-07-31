package com.mrpeng.config.model;

public class StaticType {


    //工单性质
    public static final String IN_PLANT ="厂内";
    public static final String OUT_SOURCING="委外";
    public static final String BOTH="二者皆有";

    //工艺加工状态
    public static final String ROUT_NO_PROCESS = "0";  //不可加工
    public static final String ROUT_WORKABLE = "1"; //可加工
    public static final String ROUT_PROCESSING= "2"; //加工中
    public static final String ROUT_PAUSING= "3"; //暂停中
    public static final String ROUT_PROCESSED = "4"; //加工完
    public static final String ROUT_INSPECTION_PASSED="5"; //质检通过

    //数据库UUID默认值
    public static final String UUID_DEFAULT ="00000000-0000-0000-0000-000000000000";

    //库存修改方式标识
    public static final String STOCK_INCREASE = "increase"; //增加
    public static final String STOCK_REDUCE ="reduce";

    //外仓库主键
    public static final String RAW_MATERIAL_WAREHOUSE_ID = "9D4C55A0-1A2A-48BA-67DB-16FBD5D65590";  //原材料仓（外）
    public static final String PARTIALLY_PREPARED_PRODUCTS_WAREHOUSE_ID = "E8BEF006-6F85-4A84-7D1D-16FBD81209A5"; //半成品仓（外）


    //定时器读取数据类型
    public static final String READ_NEW ="NEW";  //读取创建
    public static final String READ_MODIFIED ="MODIFIED"; //读取修改

    //任务类型
    public static final String NO_WORK="NO_WORK"; //未开工
    public static final String WORKING="WORKING"; //进行中
    public static final String WORKED="WORKED"; //完工
    public static final String NO_ACCEPT ="NO_ACCEPT"; //已接受

    //性质
    public static final String WORK_CENTER="WORK_CENTER"; //工作中心
    public static final String SUPPLIER ="SUPPLIER"; //供应商

    //云盛工单是否转移(对应字段MO_RECEIPT的UDF021字段)
    public static final String WORKSHOP_TRANSFER ="TRANSFER";
    public static final String WORKSHOP_TRANSFER_COMPLETED ="COMPLETED";

    //读取数据表
    public static final String MO ="MO";  //工单
    public static final String MO_D ="MO_D"; //工单物料单身
    public static final String ITEM ="ITEM"; //品号
    public static final String ITEM_GROUP ="ITEM_GROUP"; //品号群组
    public static final String ITEM_PLANT ="ITEM_PLANT"; //工号工厂
    public static final String MO_DEMAND ="MO_DEMAND"; //工单需求
    public static final String MO_PRODUCT ="MO_PRODUCT"; //工单产出
    public static final String MO_ROUTING ="MO_ROUTING"; //工单工艺
    public static final String MO_ROUTING_D ="MO_ROUTING_D"; //工单工艺单身
    public static final String MO_ROUTING_PATH ="MO_ROUTING_PATH"; //工单工艺路径
    public static final String SALES_ORDER_DOC ="SALES_ORDER_DOC"; //销售单
    public static final String SALES_ORDER_DOC_D ="SALES_ORDER_DOC_D"; //销售单身
    public static final String SALES_ORDER_DOC_SD ="SALES_ORDER_DOC_SD"; //发货计划



    //腾讯云 APPID
    public static final String APP_ID ="1304416627";
    public static final String SECRET_ID ="AKIDZ3VmqhKkxwhHfplTzHLBoDPN7ex2vc6O";
    public static final String SECRET_KEY ="82jCXjomX7WyKWXN3Xo00mMispZ7RYR6";
    public static final String REGION_SHANGHAI="ap-shanghai"; //地域
    public static final String BUCKET_NAME_1 ="lightweight-1304416627"; //数据桶名称
    public static final String ACCESS_NOTE_PATH ="https://lightweight-1304416627.cos-website.ap-shanghai.myqcloud.com/"; //文件访问路径


    //联系人锚点



}
