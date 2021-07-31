package com.mrpeng.config.model.myenum;

/**
 * @author pengquan
 * @version 1.0
 * @classname TeamEnum
 * @description 班组枚举类
 * @date 2021/6/22 17:06
 **/
public enum  TeamEnum {
    MACHINING("A","机加工组",""),
    ASSEMBLING("B","装配组",""),
    ELECTRIC_WELDING("C","焊接组","");
    private String code;
    private String name;
    private String id;

    TeamEnum(String code, String name, String id) {
        this.code = code;
        this.name = name;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
