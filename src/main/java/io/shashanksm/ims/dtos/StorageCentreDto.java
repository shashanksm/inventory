package io.shashanksm.ims.dtos;

import java.util.Map;
import java.util.Objects;

public class StorageCentreDto {

	private Long id;
	private String name;
	private String description;
	private Map<String, String> data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public StorageCentreDto(Long id, String name, String description, Map<String, String> data) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.data = data;
	}

	public StorageCentreDto() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorageCentreDto other = (StorageCentreDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "DistributionCentreDto [id=" + id + ", name=" + name + ", description=" + description + ", data="
				+ data + "]";
	}

}
