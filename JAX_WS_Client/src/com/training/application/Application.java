package com.training.application;

import javax.xml.ws.Response;

import com.training.ifaces.GetRequestResponse;

import examples.webservices.async.DonationRequest;
import examples.webservices.async.DonationRequestServiceService;

public class Application {

	public static void main(String[] args) {

		DonationRequestServiceService req = new DonationRequestServiceService();

		DonationRequest proxy = req.getDonationRequestServicePort();
		Response resp = proxy.getRequestAsync("Ap");

		if (!resp.isDone()) {

			try {
				System.out.println("Waiting");

				Thread t = new Thread() {

					public void run() {

						for (int i = 1; i <= 21121996; i++) {
							System.out.println(i);
						}
					}
				};

				t.start();
				t.join(2000);

				GetRequestResponse reqResponse = (GetRequestResponse) resp.get();
				System.out.println(reqResponse.getDonorDetails());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
