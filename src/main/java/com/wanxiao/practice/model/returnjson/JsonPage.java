package com.wanxiao.practice.model.returnjson;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanxiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class JsonPage<T> implements Serializable {

    private static final long serialVersionUID = 4388023603047367489L;

    @ApiModelProperty(value = "总条数")
    private Long totalSize;

    @ApiModelProperty(value = "返回数据")
    private List<T> dataList;
}
