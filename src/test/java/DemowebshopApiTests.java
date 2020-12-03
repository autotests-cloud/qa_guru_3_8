import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;


public class DemowebshopApiTests {

    @Test
    void bookStoreTest() {
        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[0].title", is("Git Pocket Guide"));
    }
}
