package com.hww.common.Vo;

import com.hww.common.entity.BsSpecAttrs;
import com.hww.common.entity.BsSpecs;
import lombok.Data;

import java.util.List;

@Data
public class GoodsVo {
    private long id;
    private String goodName;
    private String goodDes;
    private String goodThumb;
    private String goodImages;
    private double oldPrice;
    private double goodPrice;
    private double salePrice;
    private double lowSpecPrice;
    private long goodStock;
    private double goodWeight;
    private String specId;
    private long salesVolume;
    private long saleStartTime;
    private long saleEndTime;
    private String goodDetail;
    private long cateId;
    private String cascaderVals;
    private long saleStatus;
    private long status;
    private long merchantId;
    private long sortNum;
    private double shareAmount;
    private long points;
    private long levelPoints;
    private long goodsType;
    private long usePoints;
    private long maxNumber;
    private double groupPrice;
    private long requiredNumber;
    private long groupValidTime;
    private long groupSuccessNum;
    private long groupStartTime;
    private long groupEndTime;
    private long isOpenInvoice;
    private long isOutTerritory;
    private java.sql.Timestamp createdAt;
    private java.sql.Timestamp updatedAt;
    private long isOneselfBargain;
    private double bargainSpecPrice;
    private long bargainActivityTime;
    private long bargainActivityEndtime;
    private long bargainTime;
    private String bargainScope;
    private long bargainNum;
    private List<BsSpecs> specsList;
    private List<BsSpecAttrs> specAttrsList;
}
