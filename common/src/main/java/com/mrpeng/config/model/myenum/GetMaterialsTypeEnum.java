package com.mrpeng.config.model.myenum;

/**
 * 供料方式
 */
public enum GetMaterialsTypeEnum {
    /**1.厂内供料
    3.供货商供料
    5.客户供料
    4.不发料
    0.全部*/

    IN_PLANT_FEEDING(1,"厂内供料"),
    SUPPLIED_BY_SUPPLIER(3,"供货商提供"),
    CUSTOMER_SUPPLIED(5,"客户供料"),
    NO_ISSUED(4,"不发料"),
    ALL(0,"全部");





    private int num;

    private String type;

    private GetMaterialsTypeEnum(int mum,String type){
        this.num =mum;
        this.type =type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 根据num获取领料类型
     * @param num
     * @return
     */
    public static String gtMaterialsType(int num){
        for (GetMaterialsTypeEnum value : GetMaterialsTypeEnum.values()) {
            if(value.getNum()==num){
                return value.getType();
            }
        }
        return null;
    }

}
