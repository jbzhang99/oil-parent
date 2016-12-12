package com.oil.av.em;

public enum SmsTemplateNameEnum {
    NOTICE("通知"),
    REGISTER("注册验证码"),
    ACTIVE("活动"),
    PWDMODIFY("密码修改");
 	private String lable;
 	private SmsTemplateNameEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (SmsTemplateNameEnum c : SmsTemplateNameEnum.values()) {
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