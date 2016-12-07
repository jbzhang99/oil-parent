package com.oil.av.em.api;

public enum UserStateEnum {
    SAFETY("安全问题"),
    DESTROY("注销"),
    SEAL("封号"),
    NORMAL("正常"),
    LOCK("锁定");
 	private String lable;
 	private UserStateEnum(String lable){
 		this.lable = lable;
 	}
 	
 	public static String getName(String lable) {
        for (UserStateEnum c : UserStateEnum.values()) {
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