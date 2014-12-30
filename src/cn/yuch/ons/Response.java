package cn.yuch.ons;

public class Response implements OnsResponse {

	OnsContext ctx = null;

	@Override
	public OnsContext receiveResponse(OnsRequest request) {
		this.ctx = new GidOnsContext(request.getStringResult());
		return this.ctx;
	}

}
