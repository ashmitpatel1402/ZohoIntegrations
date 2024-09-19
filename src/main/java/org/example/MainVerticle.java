package org.example;

import Api.ZohoApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import Retro_Config.RetrofitClient;
import Request_Body_Models.ContactRequestBody;
import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() {
        String baseUrl = "https://www.zohoapis.com/";
        // Create the Retrofit API service
        ZohoApiService apiService = RetrofitClient.getClient(baseUrl).create(ZohoApiService.class);

        // Create a ContactRequestBody object
        ContactRequestBody contactRequest = new ContactRequestBody();
        contactRequest.setContactName("John Doe");
        contactRequest.setCompanyName("Acme Corp");
        // Set other required fields here

        // Make the API call to create a contact
        Call<Void> call = apiService.createContact("Bearer <your_token>", "10234695", contactRequest);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("Contact created successfully.");
                } else {
                    System.out.println("Failed to create contact: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
