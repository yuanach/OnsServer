package cn.yuch.ons;

import java.io.IOException;

public class AbstractOnsRequest implements OnsRequest{

	protected String stringRes;
	protected byte[] bytesRes;
	@Override
	public void sendRequest(OnsAddress addr, OnsContext request) throws IOException  {
		
	}

	@Override
	public String getStringResult() {
		return stringRes;
	}

	@Override
	public byte[] getBytesResult() {
		return bytesRes;
	}

}
