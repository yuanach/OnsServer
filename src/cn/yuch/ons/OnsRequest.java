package cn.yuch.ons;

import java.io.IOException;

public interface OnsRequest {
	void sendRequest(OnsAddress addr,OnsContext request) throws IOException;
	String getStringResult();
	byte[] getBytesResult();
}
