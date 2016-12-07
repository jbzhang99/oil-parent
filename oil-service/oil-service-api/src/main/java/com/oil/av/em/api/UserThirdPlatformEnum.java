package com.oil.av.em.api;

public enum UserThirdPlatformEnum {
    XINLANG("新浪"),
    QQ("qq"),
    WEIXIN("微信");
 	private String lable;
 	private UserThirdPlatformEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (UserThirdPlatformEnum c : UserThirdPlatformEnum.values()) {
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