package com.mrpeng.config.model.myenum;
/**
 * erp仓库枚举类
 * @author pengquan
 * @date 2021/6/1 10:14
 */
public enum WarehouseEnum {
    FINISHED_PRODUCT_BIN("101","成品仓","机加车间南","8E67F81A-A35C-49B7-9A6F-15C6F66AE148"),
    PARTIALLY_PREPARED_PRODUCTS_BIN("201","半成品仓","库房一二楼","E6E63A09-17D8-4C24-4D7A-15C6F67566D5"),
    RAW_MATERIAL_BIN("301","原材料仓","库房一二楼、机加车间南","2C9CB516-2E45-4581-023A-15C6F67B6C9D"),
    TOOL_MAGAZINE_BIN("402","刀具仓","机加车间中","16AB2208-46AE-4AC8-840E-15C6F68C0947"),
    SCRAP_BIN("901","报废品仓","机加车间中","2092D011-F0DE-400E-AA97-15C6F6928BF5"),
    CUSTOMER_SUPPLY_BIN("601","客供料仓","","3F8010CC-3533-473D-5EE2-160BF932545A"),
    OUT_RAW_MATERIAL_BIN("302","原材料仓（外）","云盛仓库","9D4C55A0-1A2A-48BA-67DB-16FBD5D65590"),
    OUT_PARTIALLY_PREPARED_PRODUCTS_BIN("203","半成品仓（外）","云盛","E8BEF006-6F85-4A84-7D1D-16FBD81209A5"),
    TOOLING_AND_TOOL_BIN("501","工装工具仓","库房底楼、机加车间南","4F653F3C-2F1D-402A-4A83-15C6F6809670"),
    AUXILIARY_MATERIAL_BIN("401","辅料仓","","70CBB67D-628C-461F-912C-15C6F6863DC1"),
    LINE_SIDE_BIN("202","线边仓","","D938607F-4C11-45DE-CAF9-15C6F69D61ED");
    private String code;
    private String name;
    private String remark;
    private String id;

    WarehouseEnum(String code, String name, String remark, String id) {
        this.code = code;
        this.name = name;
        this.remark = remark;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
