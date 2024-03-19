package ee.tu.app.web.graphql;

import ee.tu.app.domain.Person;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @QueryMapping
    public List<Person> persons() {
        return new ArrayList<>();
    }
}
