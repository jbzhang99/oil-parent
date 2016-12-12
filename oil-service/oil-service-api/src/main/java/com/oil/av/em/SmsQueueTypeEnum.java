package com.oil.av.em;

public enum SmsQueueTypeEnum {
    MEMBER("会员"),
    SYSTEM("系统");
 	private String lable;
 	private SmsQueueTypeEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (SmsQueueTypeEnum c : SmsQueueTypeEnum.values()) {
            if (c.lable.equals(lable)) {
                return c.name();
            }
        }
        return null;
    }

    // 覆盖方法
    @Override
    public String toString() {
       return this.lable;
    }  
 
    public String getLable() {
        return this.lable;
    }
    public void setLable(String lable) {
          this.lable=lable;
    }
}