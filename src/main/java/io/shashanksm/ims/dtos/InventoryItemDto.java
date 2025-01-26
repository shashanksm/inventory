package io.shashanksm.ims.dtos;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class InventoryItemDto {

	private Long id;

	private String name;

	private StorageCentreDto storageCentre;

	private Long availableQuantity;

	private LocalDateTime created;

	private LocalDateTime expiry;

	private Long catalogue;

	private Long weightInGms;

	private Long volumeInCcs;

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

	public StorageCentreDto getStorageCentre() {
		return storageCentre;
	}

	public void setStorageCentre(StorageCentreDto storageCentre) {
		this.storageCentre = storageCentre;
	}

	public Long getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDateTime expiry) {
		this.expiry = expiry;
	}

	public Long getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Long catalogue) {
		this.catalogue = catalogue;
	}

	public Long getWeightInGms() {
		return weightInGms;
	}

	public void setWeightInGms(Long weightInGms) {
		this.weightInGms = weightInGms;
	}

	public Long getVolumeInCcs() {
		return volumeInCcs;
	}

	public void setVolumeInCcs(Long volumeInCcs) {
		this.volumeInCcs = volumeInCcs;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public InventoryItemDto() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(catalogue, id, name, storageCentre, volumeInCcs, weightInGms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventoryItemDto other = (InventoryItemDto) obj;
		return Objects.equals(catalogue, other.catalogue) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(storageCentre, other.storageCentre)
				&& Objects.equals(volumeInCcs, other.volumeInCcs) && Objects.equals(weightInGms, other.weightInGms);
	}

	@Override
	public String toString() {
		return "InventoryItemDto [id=" + id + ", name=" + name + ", storageCentre=" + storageCentre
				+ ", availableQuantity=" + availableQuantity + ", created=" + created + ", expiry=" + expiry
				+ ", catalogue=" + catalogue + ", weightInGms=" + weightInGms + ", volumeInCcs=" + volumeInCcs
				+ ", data=" + data + "]";
	}

}
