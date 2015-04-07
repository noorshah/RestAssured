import static com.jayway.restassured.RestAssured.get;
import org.json.JSONArray;
import org.json.JSONException;
import java.lang.String;
import org.junit.Test;
import org.junit.Assert;

import com.jayway.restassured.response.Response;

import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
public class RestTest {
    @Test
    public void getRequestFindCapital() {
    //make get request to fetch capital of norway
    Response resp = get("http://restcountries.eu/rest/v1/name/norway");
        get("http://restcountries.eu/rest/v1/name/norway").then().body("name", hasItem("Norway"));
        get("http://restcountries.eu/rest/v1/name/norway").then().body("capital", hasItem("Oslo"));
    }

}


