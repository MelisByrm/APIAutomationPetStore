package resources;


import com.github.javafaker.Faker;
import model.Tag;

public class TagResource {
	 private static Faker faker = new Faker();
	    public static Tag generateTagWithId(int id){
	        Tag generated = new Tag();
	        generated.setId(id);
	        generated.setName(faker.name().username());
	        return generated;
	    }
}
