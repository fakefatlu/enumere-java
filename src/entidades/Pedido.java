package entidades;

import java.util.Date;

import entidade.enums.OrderStatus;

public class Pedido {

	private Integer id;
	private Date nomento;
	private OrderStatus status; 
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date nomento, OrderStatus status) {
		this.id = id;
		this.nomento = nomento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getNomento() {
		return nomento;
	}

	public void setNomento(Date nomento) {
		this.nomento = nomento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nomento=" + nomento + ", status=" + status + "]";
	}
	

	
}

