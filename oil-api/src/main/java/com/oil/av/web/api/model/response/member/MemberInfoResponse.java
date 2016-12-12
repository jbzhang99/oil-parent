package com.oil.av.web.api.model.response.member;

import com.oil.av.web.api.model.response.BaseResponse;

public class MemberInfoResponse extends BaseResponse{

    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -939261706201571601L;

    private String	memberId;//用户id

    
    /**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
