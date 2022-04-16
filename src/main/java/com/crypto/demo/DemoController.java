package com.crypto.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.List;

@RestController
@CrossOrigin
public class DemoController {
	@GetMapping(value= "/encode/{value}")
	public String encode(@PathVariable String value) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		byte[] bytes = value.getBytes("UTF-8");
		return Base64.getEncoder().encodeToString(bytes);
	}

	@GetMapping(value= "/decode/{value}")
	public String decode(@PathVariable String value) throws IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
		return new String(Base64.getDecoder().decode(value));
	}

}
