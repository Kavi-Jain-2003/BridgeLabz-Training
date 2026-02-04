import java.io.File;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class EmailValidation {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json = mapper.readTree(new File("user.json"));
        JsonNode schemaNode = mapper.readTree(new File("schema.json"));

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(json);

        if (errors.isEmpty()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
