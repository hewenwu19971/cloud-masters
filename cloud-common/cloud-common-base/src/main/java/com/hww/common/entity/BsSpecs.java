package com.hww.common.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
public class BsSpecs implements Serializable {

  private long id;
  private String specName;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private List<BsSpecAttrs> bsSpecAttrs;

}
