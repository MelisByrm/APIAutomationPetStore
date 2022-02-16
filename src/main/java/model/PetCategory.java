package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class PetCategory {
	private int id;
    private String name;
    
    public void setName(String name) {
    	this.name = name;
    }

	public void setId(int id) {
		this.id = id;
		
	}
    
}
