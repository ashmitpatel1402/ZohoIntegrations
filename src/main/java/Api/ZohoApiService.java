package Api;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import Request_Body_Models.ContactRequestBody;
public interface ZohoApiService {

    @POST("books/v3/contacts")
    Call<Void> createContact(
            @Header("Authorization") String authToken,
            @Query("organization_id") String organizationId,
            @Body ContactRequestBody contactBody
    );
}
