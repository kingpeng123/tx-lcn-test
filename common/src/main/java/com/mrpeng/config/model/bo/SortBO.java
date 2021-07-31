package com.mrpeng.config.model.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: pqq
 * @create: 2021-01-15 12:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortBO{


    //单据ID
    private String id;
    //单据时间
    private Date startDate;

    //单据内容
    Object data;

}
