package com.oil.av.em.api;

public enum UserPublicMessageEnum {
    OPEN("开启"),
    CLOSE("结束");
 	private String lable;
 	private UserPublicMessageEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (UserPublicMessageEnum c : UserPublicMessageEnum.values()) {
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