package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Tag {
	private int id;
    private String name;
    
	public void setId(int id) {
		this.id = id;
		
	}

	public void setName(String username) {
		this.name = username;
	}
}
