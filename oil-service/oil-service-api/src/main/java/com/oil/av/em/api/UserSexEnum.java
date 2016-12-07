package com.oil.av.em.api;

public enum UserSexEnum {
    WOMEN("女"),
    MAN("男"),
    NONE("未设置");
 	private String lable;
 	private UserSexEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (UserSexEnum c : UserSexEnum.values()) {
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