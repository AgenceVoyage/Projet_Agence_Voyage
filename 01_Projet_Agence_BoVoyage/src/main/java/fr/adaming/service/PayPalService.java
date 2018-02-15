package fr.adaming.service;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;


public class PayPalService {
	// Replace with your application client ID and secret
	String clientId = "";
	String clientSecret = "";

	APIContext context = new APIContext(clientId, clientSecret, "sandbox");
}
