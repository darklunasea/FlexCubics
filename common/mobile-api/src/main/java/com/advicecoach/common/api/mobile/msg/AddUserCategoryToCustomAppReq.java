package com.advicecoach.common.api.mobile.msg;

import com.advicecoach.common.datamodel.custom.CustomCategory;
import lombok.Data;

/**
 * Created by nan on 1/1/2017.
 */
@Data
public class AddUserCategoryToCustomAppReq {
    private Integer customAppId;
    private CustomCategory newCategory;
}
