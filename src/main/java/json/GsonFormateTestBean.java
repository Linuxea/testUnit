package json;

/**
 * @author linuxea
 * @date 2018/6/7
 */
public class GsonFormateTestBean {
	/**
	 * result : {"paramMap":{"pageSize":"50","idcard":"4407030600053741","currentPage":"1"},"code":103,"msg":"验证串校验错误","header":{"bsName":"personContractBS","ip":"sssssssss","method":"listContract","operateId":"userId","operateName":"userName","operateTm":"Jmzhrs","systemId":"Jmzhrs","systemPassword":"A04A06D51A830FBEA157AC288A569899A8B790007E4C8660","validStr":"498AF3E756A24AA7ED694812A7B7FC3D3E10C0A7C7532A988868A81F8763D0A4D9835990F51BF9FFAB2EA690E9AB2109E59A2899CF1FB52AA29A766DB65537AA"},"wsUser":null}
	 * data :
	 */
	
	private ResultBean result;
	private String data;
	
	public ResultBean getResult() {
		return result;
	}
	
	public void setResult(ResultBean result) {
		this.result = result;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "GsonFormateTestBean{" +
				"result=" + result +
				", data='" + data + '\'' +
				'}';
	}
	
	public static class ResultBean {
		/**
		 * paramMap : {"pageSize":"50","idcard":"4407030600053741","currentPage":"1"}
		 * code : 103
		 * msg : 验证串校验错误
		 * header : {"bsName":"personContractBS","ip":"sssssssss","method":"listContract","operateId":"userId","operateName":"userName","operateTm":"Jmzhrs","systemId":"Jmzhrs","systemPassword":"A04A06D51A830FBEA157AC288A569899A8B790007E4C8660","validStr":"498AF3E756A24AA7ED694812A7B7FC3D3E10C0A7C7532A988868A81F8763D0A4D9835990F51BF9FFAB2EA690E9AB2109E59A2899CF1FB52AA29A766DB65537AA"}
		 * wsUser : null
		 */
		
		private ParamMapBean paramMap;
		private int code;
		private String msg;
		private HeaderBean header;
		private Object wsUser;
		
		public ParamMapBean getParamMap() {
			return paramMap;
		}
		
		public void setParamMap(ParamMapBean paramMap) {
			this.paramMap = paramMap;
		}
		
		public int getCode() {
			return code;
		}
		
		public void setCode(int code) {
			this.code = code;
		}
		
		public String getMsg() {
			return msg;
		}
		
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		public HeaderBean getHeader() {
			return header;
		}
		
		public void setHeader(HeaderBean header) {
			this.header = header;
		}
		
		public Object getWsUser() {
			return wsUser;
		}
		
		public void setWsUser(Object wsUser) {
			this.wsUser = wsUser;
		}
		
		public static class ParamMapBean {
			/**
			 * pageSize : 50
			 * idcard : 4407030600053741
			 * currentPage : 1
			 */
			
			private String pageSize;
			private String idcard;
			private String currentPage;
			
			public String getPageSize() {
				return pageSize;
			}
			
			public void setPageSize(String pageSize) {
				this.pageSize = pageSize;
			}
			
			public String getIdcard() {
				return idcard;
			}
			
			public void setIdcard(String idcard) {
				this.idcard = idcard;
			}
			
			public String getCurrentPage() {
				return currentPage;
			}
			
			public void setCurrentPage(String currentPage) {
				this.currentPage = currentPage;
			}
		}
		
		public static class HeaderBean {
			/**
			 * bsName : personContractBS
			 * ip : sssssssss
			 * method : listContract
			 * operateId : userId
			 * operateName : userName
			 * operateTm : Jmzhrs
			 * systemId : Jmzhrs
			 * systemPassword : A04A06D51A830FBEA157AC288A569899A8B790007E4C8660
			 * validStr : 498AF3E756A24AA7ED694812A7B7FC3D3E10C0A7C7532A988868A81F8763D0A4D9835990F51BF9FFAB2EA690E9AB2109E59A2899CF1FB52AA29A766DB65537AA
			 */
			
			private String bsName;
			private String ip;
			private String method;
			private String operateId;
			private String operateName;
			private String operateTm;
			private String systemId;
			private String systemPassword;
			private String validStr;
			
			public String getBsName() {
				return bsName;
			}
			
			public void setBsName(String bsName) {
				this.bsName = bsName;
			}
			
			public String getIp() {
				return ip;
			}
			
			public void setIp(String ip) {
				this.ip = ip;
			}
			
			public String getMethod() {
				return method;
			}
			
			public void setMethod(String method) {
				this.method = method;
			}
			
			public String getOperateId() {
				return operateId;
			}
			
			public void setOperateId(String operateId) {
				this.operateId = operateId;
			}
			
			public String getOperateName() {
				return operateName;
			}
			
			public void setOperateName(String operateName) {
				this.operateName = operateName;
			}
			
			public String getOperateTm() {
				return operateTm;
			}
			
			public void setOperateTm(String operateTm) {
				this.operateTm = operateTm;
			}
			
			public String getSystemId() {
				return systemId;
			}
			
			public void setSystemId(String systemId) {
				this.systemId = systemId;
			}
			
			public String getSystemPassword() {
				return systemPassword;
			}
			
			public void setSystemPassword(String systemPassword) {
				this.systemPassword = systemPassword;
			}
			
			public String getValidStr() {
				return validStr;
			}
			
			public void setValidStr(String validStr) {
				this.validStr = validStr;
			}
		}
	}
}
