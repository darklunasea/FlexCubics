package com.advicecoach.common.api.mobile.msg;

import com.advicecoach.common.datamodel.custom.CustomApp;
import lombok.Data;

/**
 * Created by nan on 12/27/2016.
 */
@Data
public class GetCustomAppResp {
    private Integer customAppId;
    private CustomApp customApp;
}
