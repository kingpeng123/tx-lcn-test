package com.mrpeng.config.globalhandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.mrpeng.config.utils.DateUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 填充器
 */

@Component
public class MybatisMetaHandler implements MetaObjectHandler {
    /**
     * mybatis-plus添加时
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //自动填充创建时间
        this.strictInsertFill(metaObject,"createTime",Date.class,new Date());
        this.strictInsertFill(metaObject,"createDate",String.class, DateUtils.getNowDate());
        this.strictInsertFill(metaObject,"modifyTime",Date.class,new Date());
        this.strictInsertFill(metaObject,"CreateDate",Date.class,new Date());
        this.strictInsertFill(metaObject,"LastModifiedDate",Date.class,new Date());
        this.strictInsertFill(metaObject,"ModifiedDate",Date.class,new Date());
        this.strictInsertFill(metaObject,"ApproveDate",Date.class,new Date());
        //字符串类型
//        this.strictInsertFill(metaObject,"CreateDate",String.class,DateUtils.getNowDate());
//        this.strictInsertFill(metaObject,"LastModifiedDate",String.class,DateUtils.getNowDate());
//        this.strictInsertFill(metaObject,"ModifiedDate",String.class,DateUtils.getNowDate());

        //自动填充修改时间
        this.strictInsertFill(metaObject,"modifyDate",String.class, DateUtils.getNowDate());
        this.strictInsertFill(metaObject,"deleted",Integer.class,0);
    }

    /**
     * mybatis-plus 修改时
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
//        this.strictUpdateFill(metaObject,"modifyTime",()-> new Date(),Date.class);
        this.strictUpdateFill(metaObject,"modifyDate",()-> DateUtils.getNowDate(),String.class);
        this.strictUpdateFill(metaObject,"LastModifiedDate",()-> new Date(),Date.class);
        this.strictUpdateFill(metaObject,"ModifiedDate",()-> new Date(),Date.class);
        this.strictUpdateFill(metaObject,"ApproveDate",()-> new Date(),Date.class);

        //字符串类型
//        this.strictUpdateFill(metaObject,"LastModifiedDate",()-> DateUtils.getNowDate(),String.class);
//        this.strictUpdateFill(metaObject,"ModifiedDate",()-> DateUtils.getNowDate(),String.class);
    }


}
