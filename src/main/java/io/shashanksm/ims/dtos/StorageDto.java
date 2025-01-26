package io.shashanksm.ims.dtos;

import java.util.Objects;

public class StorageDto {
	
	private String location;
	
	private Long weightCapacityInGms;
	
	private Long volumeCapacityInCcs;
	
	private StorageCentreDto storageCentre;
	
	private Boolean empty;
	
	private InventoryItemDto inventoryItem;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getWeightCapacityInGms() {
		return weightCapacityInGms;
	}

	public void setWeightCapacityInGms(Long weightCapacityInGms) {
		this.weightCapacityInGms = weightCapacityInGms;
	}

	public Long getVolumeCapacityInCcs() {
		return volumeCapacityInCcs;
	}

	public void setVolumeCapacityInCcs(Long volumeCapacityInCcs) {
		this.volumeCapacityInCcs = volumeCapacityInCcs;
	}

	public StorageCentreDto getStorageCentre() {
		return storageCentre;
	}

	public void setStorageCentre(StorageCentreDto storageCentre) {
		this.storageCentre = storageCentre;
	}

	public Boolean getEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}

	public InventoryItemDto getInventoryItem() {
		return inventoryItem;
	}

	public void setInventoryItem(InventoryItemDto inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

	public StorageDto() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorageDto other = (StorageDto) obj;
		return Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "StorageDto [location=" + location + ", weightCapacityInGms=" + weightCapacityInGms
				+ ", volumeCapacityInCcs=" + volumeCapacityInCcs + ", storageCentre=" + storageCentre + ", empty="
				+ empty + ", inventoryItem=" + inventoryItem + "]";
	}
	
	
	
}
