package model;


import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.ArrayList;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Pet {
	private int id;
    private PetCategory category;
    private String name;
    private ArrayList<String> photoUrls;
    private ArrayList<Tag> tags;
    private PetStatus status;
    
    public void setName(String name) {
    	this.name = name;
    }

	public void setId(int id) {
		this.id = id;
	}

	public void setCategory(PetCategory category) {
		this.category = category;
	}


	public void setStatus(PetStatus available) {
		this.status = available;
		
	}

	public void setPhotoUrls(ArrayList<String> arrayList) {
		this.photoUrls = arrayList;
		
	}

	public void setTags(ArrayList<Tag> arrayList) {
		this.tags = arrayList;
		
	}
	
	
	
	
	
	
}
