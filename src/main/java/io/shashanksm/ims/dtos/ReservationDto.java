package io.shashanksm.ims.dtos;

import java.time.LocalDateTime;
import java.util.Objects;

public class ReservationDto {

	private Long id;

	private Long interaction;

	private Long order;

	private Long inventoryItem;

	private Long quantity;

	private String status;

	private LocalDateTime created;

	private LocalDateTime maxPickTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInteraction() {
		return interaction;
	}

	public void setInteraction(Long interaction) {
		this.interaction = interaction;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public Long getInventoryItem() {
		return inventoryItem;
	}

	public void setInventoryItem(Long inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getMaxPickTime() {
		return maxPickTime;
	}

	public void setMaxPickTime(LocalDateTime maxPickTime) {
		this.maxPickTime = maxPickTime;
	}

	public ReservationDto() {
		super();
	}

	@Override
	public String toString() {
		return "ReservationDto [id=" + id + ", interaction=" + interaction + ", order=" + order + ", inventoryItem="
				+ inventoryItem + ", quantity=" + quantity + ", status=" + status + ", created=" + created
				+ ", maxPickTime=" + maxPickTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(interaction, inventoryItem, order, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservationDto other = (ReservationDto) obj;
		return Objects.equals(interaction, other.interaction) && Objects.equals(inventoryItem, other.inventoryItem)
				&& Objects.equals(order, other.order) && Objects.equals(quantity, other.quantity);
	}

}