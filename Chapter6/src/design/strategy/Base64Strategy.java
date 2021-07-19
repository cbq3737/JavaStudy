package design.strategy;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{

	//인코딩 시켜준 것.
	@Override
	public String encode(String text) {
		return Base64.getEncoder().encodeToString(text.getBytes());
	}
}
